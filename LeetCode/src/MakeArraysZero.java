import java.util.Arrays;

public class MakeArraysZero {
    public static void main(String[] args) {

        int [] seats = {3,1,5};
        int [] studs = {2,7,4};
        int [] sub = new int[studs.length];
        int sum = 0;

        Arrays.sort(seats);
        Arrays.sort(studs);

        for (int i = 0; i<seats.length; i++){
            sub[i] =  studs[i] - seats[i];
          //  sum = sum + sub[i];
            sum = sum + Math.abs((sum - sub[i]));
        }

        System.out.println(sum);

    }
}
