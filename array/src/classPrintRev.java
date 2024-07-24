import java.util.Arrays;

public class classPrintRev {
    public static void main(String[] args) {
        int [] arr = {1,5,6,8,9,10};
        int [] rev = new int[arr.length];

        int j = 0;
        int i = arr.length-1;

        while (i>=0){
            rev[j++] = arr[i--];

            // it will be also print all the all the Arrays Elements
           // System.out.println(Arrays.toString(rev));
        }

        for (int k = 0; k<rev.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
