import java.util.Arrays;

public class SetMissMatch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        int size = nums.length - 1;
        int reNo = 0;
        int sum = 0;
        int naSum = 0;
        naSum = (size * (size + 1)) / 2;
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    reNo = nums[i];
                    arr[0] = reNo;
                }
            }
        }

        int result = naSum - (sum - arr[0]);

        arr[1] = result;
        System.out.println(result);

        System.out.println(Arrays.toString(arr));

    }
}
