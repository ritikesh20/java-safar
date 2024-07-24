import java.lang.reflect.Array;
import java.util.ArrayList;

public class mergerTwoArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        int[] nums = {1, 3, 5};

        ArrayList<Integer> list = new ArrayList<>();

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == nums[i]) {
//                list.add(arr[i]);
//                i++;
//            }
//            if (arr[i] > nums[i]) {
//                list.add(nums[i]);
//                i++;
//            }
//            if (arr[i] < nums[i]) {
//                list.add(arr[i]);
//                i++;
//            }
//        }
        int i = 0;
        int j = 0;
        int end = arr.length - 1;
        System.out.println("end = " + end);

        while (i <= end && j<= end){
            if (arr[i] >= nums[j]) {
                list.add(arr[i]);
                i++;
            }
            else if (arr[i] < nums[j]) {
                list.add(nums[i]);
                j++;
            }
//            else if (arr[i] < nums[j]) {
//                list.add(arr[i]);
//                i++;
//            }
        }
        System.out.println(list);
    }
}
