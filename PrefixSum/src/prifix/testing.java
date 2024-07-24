package prifix;

import java.util.Arrays;

public class testing {
    public static class priSum {
        public static void main(String[] args) {

            int[] arr = {5, 3, 2, 6, 3, 1};
            int[] rightSum = new int[arr.length];
            int[] leftSum = new int[arr.length];

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                leftSum[i] = sum;
            }
            int x = 0;
            int add = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                add = add + arr[i];
                rightSum[i] = add;
            }

            System.out.println(Arrays.toString(leftSum));
            System.out.println(Arrays.toString(rightSum));

            int start = 0;
            int end = arr.length-1;
            int ans = 0;

            while (start < end){
                if(leftSum[start] == rightSum[start+1]){
                    ans = leftSum[start];
                }
                start++;
            }

            System.out.println(ans);
        }
    }
}
