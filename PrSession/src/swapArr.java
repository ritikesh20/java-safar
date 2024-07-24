import java.util.Arrays;

public class swapArr {
    public static void main(String[] args) {

        int [] arr = {1,2,3,8,4,5,6};

        int start = 0;
        int end = arr.length-1;

        while (start<end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

    }
}
