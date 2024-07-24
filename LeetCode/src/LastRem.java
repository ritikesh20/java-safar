import java.util.Arrays;

public class LastRem {
    public static void main(String[] args) {

        int n = 9;
        int e = 0;
        int i = 0;

        int[] arr = new int[n];

        for ( i = 0; i < n; i++) {
            arr[i] = i + 1;

        }

        while (arr.length != 1) {
            int[] nArr = new int[arr.length / 2];

            for ( i = 0; i < arr.length; i++) {
                if (i  % 2 != 0) {
                    nArr[e++] = nArr[i + 1];
                }
            }
            arr = nArr;
        }

        System.out.println(Arrays.toString(arr));
    }
}
