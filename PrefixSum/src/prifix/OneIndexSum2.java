package prifix;
import java.util.Arrays;

public class OneIndexSum2 {
    public static void main(String[] args) {

        int[] arr = {0, 2, 4, 1, 3, 6, 5};
        int l = 2;
        int r = 6;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        int ans = arr[r] - arr[l - 1];
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }
}
