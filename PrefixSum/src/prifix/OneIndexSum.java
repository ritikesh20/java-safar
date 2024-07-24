package prifix;

public class OneIndexSum {
    public static int rangeSum(int[] arr, int l, int r) {

        int sum = 0;
        for (int i = l; i <=r; i++) {
            sum = sum + arr[i - 1];
        }
        return sum;
    }


    public static void main(String[] args) {

        int l = 1;
        int r = 3;
        int[] arr = {2, 4, 1, 3, 6};

        int ans = rangeSum(arr, l, r);
        System.out.println(ans);
    }
}
