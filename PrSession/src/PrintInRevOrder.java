import java.util.Scanner;

public class PrintInRevOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {40, 10, 9, 8, 5,1};

        int end = arr.length - 1;
        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        while (start<=end){
            int temp = arr[end];
             arr[end] = arr[start] ;
             arr[start] = temp;

            start++;
            end--;
        }
        System.out.println();

        for (int j = 0; j < arr.length ; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}

