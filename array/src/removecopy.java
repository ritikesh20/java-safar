import java.util.Arrays;
import java.util.Scanner;

public class removecopy{
    public static void main(String [] args){
        // remove copy elements in arr
        int [] arr = {1,2,1};
        int size = arr.length-1;

        System.out.print("Array : ");

        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.print("Copy Elements in Arrays : ");
        for (int i = 0; i<=size; i++){
            for(int j = i + 1; j<=size; j++){
                if (arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                }

            }
        }
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Final Arrays : ");
        System.out.println(Arrays.toString(arr));
    }
}