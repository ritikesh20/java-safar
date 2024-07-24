import java.util.Arrays;

public class MergedArrays {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int[] jrr = {2, 5, 6};
        int m = 3;
        int n = 3;
        int[] mga = new int[ m + n];

        int i , j = 0;

//        for (int i = 0; i < m; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(jrr[i] + " ");
//        }
//        System.out.println();

        for ( i = 0; i < arr.length; i++) {
            mga[i] = arr[i];
        }
        for (j = 0; j < jrr.length; j++) {
            mga[i] = jrr[j];
            i++;
        }
        Arrays.sort(mga);
        System.out.println(Arrays.toString(mga));
    }
}

