import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = {2, 7, 11, 15, 60};
        int target = 75;
        int[] ans = {-1, -1};

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (map.containsKey(target - arr[i]) && map.get(target - arr[i]) != i) {
                ans = new int[]{i, map.get(target - arr[i])};
                break;
            }
        }
        System.out.print(Arrays.toString(ans));
    }
}


