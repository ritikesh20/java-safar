import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,0,0};
        int [] jrr = {9,8,7,6,5};
        int size = arr.length + jrr.length;
        int i,j = 0;
        int [] mg = new int [size];
        System.out.println("Array 1");
        for ( i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int min = 0;
        System.out.println();
        System.out.println("Array 2");
        for ( j = 0; j < jrr.length; j++){
            System.out.print(jrr[j] + " ");

        }
        System.out.println("\n***************************");
        for ( i = 0; i < arr.length; i++){
            mg[i] = arr[i];
        }
        System.out.println();
        for ( j = 0; j < jrr.length; j++){
            mg[i] = jrr[j];
            i++;
        }
        System.out.println("Marged Array ");
        for (i = 0; i < mg.length; i++){
            if(mg[i] > 0) {
                System.out.print(mg[i] + " ");
            }
        }
        System.out.println();
        Arrays.sort(mg);

        System.out.println(Arrays.toString(mg));
    }
}
