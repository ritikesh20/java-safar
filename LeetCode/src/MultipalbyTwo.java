import java.util.Arrays;

public class MultipalbyTwo {
    public static void main(String[] args) {

        int [] arr = {8,19,4,2,15,3};

        int x = 2;


        for (int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                x = x * 2;
            }
        }
        System.out.println(x);
    }
}
