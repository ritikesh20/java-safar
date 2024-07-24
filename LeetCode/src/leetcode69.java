import java.util.Arrays;

public class leetcode69 {
    public static void main(String[] args) {

        // int n = 4;
//        int ans = 1;
//        int x = 1;
//        for (int i = 1; i <= n; i++) {
//            ans = i * i;
//            if (ans <= n) {
//                x = i;
//            }
//            if(ans > n){
//                break;
//            }
//        }
//        System.out.println(x);
//
        int n = 28;
        int start = 1;
        int end = n;
        int res = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int ans = mid * mid;


            if (ans <= n) {
                res = mid;
                start = mid + 1;
            } else {

                end = mid - 1;
            }
        }
        System.out.println(res);
        //            if (ans <= n) {
//                res = mid;
//                break;
//            } else if (ans > n) {
//                end = mid - 1;
//            } else if (ans < n) {
//                start = mid + 1;
//            }
    }
}
