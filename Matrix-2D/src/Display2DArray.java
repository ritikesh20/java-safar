import java.util.Scanner;

public class Display2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int [] [] arr= {{1,2,3},{4,5,6},{7,9,10}};
        System.out.println();
        int row = 0;
        int col = 0;
        System.out.println("Enter Row");
        row = input.nextInt();
        System.out.println("Enter Col");
        col = input.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("Display Arrays");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}