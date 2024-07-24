import java.util.Arrays;

public class ShiftNegNoToLeftSide {
    public static void main(String[] args) {
        int[] arr ={-1,-2,3,4,-5}; //{-4, -56, 1, 2, 3, 4, -6, 66, 78, -76, -5};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] < 0) {
                start++;
            }
            else if (arr[end] >= 0) {
                end--;
            }
            else {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}