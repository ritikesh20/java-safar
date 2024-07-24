import java.util.*;
public class maxGap {
    public static void main(String[] args) {

        int [] nums = {8, 15, 2, 7, 20};
        Arrays.sort(nums);
        int sum = 0;
        int maxi = Integer.MIN_VALUE;


        for(int i = nums.length-1; i>=1; i--){
            sum = nums[i] - nums[i-1];
            maxi = Math.max(maxi,sum);
        }
        System.out.print(maxi);
    }
}
