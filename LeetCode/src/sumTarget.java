import java.util.Arrays;

public class sumTarget {
    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 5, 4, -6, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int k = 2;

//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end) {
//            int max = 0;
//            int min = 0;
//            int winner = 0;
//            for (int i = 0; i < arr.length; i++) {
//                max = Math.max(arr[0], arr[1]);
//                min = Math.min(arr[0], arr[1]);
//            }
//            winner = max;
//            int temp = min;
//            System.out.println(Arrays.toString(arr));
//            System.out.println(winner);
//
//            for (int i = 0; i < arr.length - 1; i++) {
//                arr[i] = arr[i + 1];
//            }
//            arr[arr.length - 1] = temp;
//
//            start++;
//
//        }
//

        // System.out.println(winner);
    }
}
