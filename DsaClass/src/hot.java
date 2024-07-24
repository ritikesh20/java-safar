import java.util.ArrayList;
import java.util.Arrays;

public class hot {
    public static void main(String[] args) {

        int[] arr = {2, 6, 3, 8, 5, 4};
        int[] nums = {6, 7, 5, 1, 8, 6};
        int i = 0;
        int j = 0;
        int[] ans = new int[arr.length + nums.length];

        int sizeArr = arr.length - 1;
        int numsArr = nums.length - 1;
        int x = 0;

        while (i <= sizeArr && j <= numsArr) {
            if (arr[i] < nums[j]) {
                ans[x++] = arr[i];
                i++;
            } else {
                ans[x++] = nums[j];
                j++;
            }
        }
        while (i <= sizeArr) {
            ans[x++] = arr[i++];
        }

        // Copy remaining elements from nums, if any
        while (j <= numsArr) {
            ans[x++] = nums[j++];
        }
        System.out.println(Arrays.toString(ans));

    }
}
