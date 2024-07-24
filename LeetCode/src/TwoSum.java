import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {5, 2, 11, 3, 15, 7};
        int target = 10;
        int[] ans = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        System.out.println(map);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i])  != i) {
                                     //           // map.get check (i+1)
                //int [] res = {i,map.get(target - nums[i])};
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}