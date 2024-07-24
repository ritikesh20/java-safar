import java.util.Arrays;

public class modSum {
    public static void main(String[] args) {

        int[] arr = {5, 15, 22};
        int[] jrr = {14, 37, 5,};

        int[] sum = new int[arr.length];
        int add = 0;
        int x = 0;
        int last = 0;
        int carry = 0;

//        for (int i = 0; i<sum.length; i++){
//            sum[i] = arr[i] + jrr[i];
//        }
//        for (int i = 0; i<sum.length; i++){
//            System.out.print(sum[i] + " ");
//        }
        System.out.println();

//        int add = arr[2] + jrr[2];
//       // System.out.println(add);
//
//        int rem = add / 10;
//
//        int last = add % 10;
//        System.out.println(last);
//
//        int ans = rem + arr[1] + jrr[1];
//        System.out.println(ans);
//
        System.out.println();

        int end = arr.length - 1;
        int stop = jrr.length - 1;

        while (end >= 0 ) {
            add = carry + arr[end] + jrr[end];

            carry = add / 10;

            last = add % 10;
            sum[x++] = last;

            end--;
            stop--;
        }
        System.out.println(Arrays.toString(sum));
//        for (int i = x; i>=0; i--){
//            System.out.print(sum[i] + " ");
//        }
        for (int i = 0; i<=x; i++){
            System.out.print(sum[i] + " ");
        }

        for (int i = end; i>=0; i-- ){
            
        }
    }
}
