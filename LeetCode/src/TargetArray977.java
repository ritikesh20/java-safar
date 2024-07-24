import java.util.Arrays;

public class TargetArray977 {
    public static void main(String[] args) {

//        977. Squares of a Sorted Array

//        Given an integer array nums sorted in non-decreasing order, return an array of the squares of
//        each number sorted in non-decreasing order.
//                Example 1:
//        Input: nums = [-4,-1,0,3,10]
//        Output: [0,1,9,16,100]

        int[] nums = {-4, -1, 0, 3, 10};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int sq = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            sq = Math.abs(nums[i] * nums[i]);
            max = Math.min(max, sq);
            System.out.print(max + " ");
        }
    }
}
