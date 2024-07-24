package prifix;

public class demo {
    public static int totalSum(int[] arr) {
        int sum = 0;

        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    public static int check(int [] arr){
        int x = totalSum(arr);
        int preSum = 0;
        int res = 0;
        for (int i = 0; i<arr.length; i++){
            preSum = preSum + arr[i];
            int suffixSum = x - preSum;
            if(suffixSum == preSum){
                res = arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 6, 3, 1};

        int ans = totalSum(arr);
        int result = check(arr);
        System.out.println(result);

        System.out.println(ans);
    }
}
