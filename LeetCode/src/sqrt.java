import java.util.Arrays;

public class sqrt {
    public static void main(String[] args) {

        int[] nums = {2, 3, 5};

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int add = 0;
            for (int j = 0; j < nums.length; j++) {

                int sum = Math.abs((nums[i] - nums[j]));
                add = add + sum;

                System.out.print(nums[i] + "-" + nums[j] + "=" + sum + " ");
                ans[i] = add;
            }

           // System.out.println(add + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(ans));
    }
}
