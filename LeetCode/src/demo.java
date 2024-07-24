import java.util.Arrays;

public class demo {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int [] leftSum = new int[arr.length];
        int lmax = 0;

        int [] rigthSum = new int[arr.length];
        int Rmax = 0;

        for (int i = 0; i < arr.length; i++) {
            lmax = Math.max(lmax,arr[i]);
            leftSum[i] = lmax;
        }

        for (int i = arr.length-1; i>= 0; i--){
            Rmax = Math.max(arr[i],Rmax);
            rigthSum[i] = Rmax;
        }
        System.out.println(Arrays.toString(leftSum));
        System.out.println(Arrays.toString(rigthSum));

        int sum = 0;

        for (int i = 0; i<arr.length; i++){
            sum = sum + (Math.min(leftSum[i] , rigthSum[i]) - arr[i]);
        }
        System.out.println(sum);
    }
}
