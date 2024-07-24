import java.util.Arrays;
import java.util.Scanner;

public class ClockRotated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arr = {1,2,3,4};
        // O/P     = {55,1,2,3,4};
        int ans = 1;

        for(int i = 1; i<arr.length; i++){
            ans = ans * arr[i];
        }
        System.out.println(ans);
//        int size = 3;
//        int [] arr = new int[size];
//        int k = 1;
//        for (int i = 0; i<arr.length; i++){
//            arr[i] = input.nextInt();
//        }
//
//        for (int i = arr.length-1; i>=k; i--){
//            System.out.print(arr[i] + " ");
//        }
//
//        for (int i = 0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
    }
}
