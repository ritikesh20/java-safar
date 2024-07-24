import java.util.ArrayList;
import java.util.Arrays;

public class countDigits {
    public static void main(String[] args) {

        int n = 5;
        int [] ans = new int[n+1];


        for (int i = 1; i<=n; i++){
            System.out.println(i);
            ans[i] = i;

        }
       // int max = Math.max(a,b);
        System.out.println(Arrays.toString(ans));
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        int count = 0;

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            if(arr[start] > 0){
                while (arr[start] > 0){
                    int rem = arr[start] % 10;

                    System.out.print(rem + " ");
                    if(rem == 1){
                        count++;
                    }


                    arr[start] = arr[start] / 10;
                }
            }
            start++;
        }
        System.out.println();
        System.out.println("Count :" + count);
    }
}

