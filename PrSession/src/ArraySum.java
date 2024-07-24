import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arr = {10,20,30,40};//new int[4];
        int sum = 0;
        int i = 0;
        String s = "";
        for ( i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);


        for ( i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
