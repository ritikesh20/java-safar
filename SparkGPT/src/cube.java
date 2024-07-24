import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] nums = {1,2,3,4,5,6,7};
        int target = 1;
        int start = 0;
        int end = nums.length;
        int index = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (nums[mid] > target) {
                end = mid;
                index = end;
            } else if (nums[mid] < target) {
                start = mid + 1;
                index = start;
            }

        }
        System.out.println(index);
    }
}
