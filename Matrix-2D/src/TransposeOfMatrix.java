import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = 3;
        int col = 3;

        int[][] arr = new int[row][col];

        System.out.println("Enter Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        //It's Just Change in print
        // NOt Change in Main Arrays
        System.out.println("Transpose Of Matrix");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

    }
}
