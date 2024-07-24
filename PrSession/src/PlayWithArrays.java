import java.util.Arrays;
import java.util.Scanner;

public class PlayWithArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {1, 2,0, 3, 4, 0,5, 6,0, 7,8,0,45};

        int start = 0;
        int end = 0;

//        while (start<end){
//            if(arr[start] ==  0){
//                int temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
//                start++;
//                end++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

       // for(int i = 0; i<arr.length; i++)
        while (start<arr.length){
            if(arr[start] == 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                end++;
//
            }
            start++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
