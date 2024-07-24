package prifix;

import java.util.Arrays;

public class factorial {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        for (int i = 1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
