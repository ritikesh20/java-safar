import java.util.Arrays;

public class kthRo {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int k = 4;
        int start = 0;
        int end = k;

//        int start = 0;
//        int end = arr.length-1;
//
//        while (start < end){
//
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//
//            start++;
//            end--;
//        }
//        for (int i = 0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

//        int temp = arr[0];
//
//        for (int i = 1; i<arr.length; i++){
//            arr[i-1] = arr[i];
//        }
//        arr[arr.length-1] = temp;
//
//        System.out.println(Arrays.toString(arr));

        while (start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
       for (int i = 0; i<end; i++){
           System.out.print(arr[i] + " ");
       }
    }
}
