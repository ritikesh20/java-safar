import java.util.*;

public class LeetCode448 {
    public static void main(String[] args) {//{1,1};//2

        int[] nums ={1,1};// {1, 2, 2, 3, 3, 4, 7, 8};
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }

        for (int i = 1; i<=nums.length; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}

