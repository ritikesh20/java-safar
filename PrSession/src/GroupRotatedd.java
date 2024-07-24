import java.util.Arrays;

public class GroupRotatedd {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5};

        int k = 2;
        int start = 0;
        int end = k;
        int x = k+1;
        int z = arr.length-1;

        while (start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        while (x<=z){
            int temp = arr[x];
            arr[x] = arr[z];
            arr[z] = temp;
            x++;
            z--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
