import java.util.Scanner;

public class SumOf2DMatix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = 3;
        int col = 3;

        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        int[][] sum = new int[row][col];


        System.out.println("Matrix 1");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix 2");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = input.nextInt();
            }
        }

        System.out.println("Sum");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = arr1[i][j] * arr2[i][j];
                //just change the sign op operators
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//
//            }
//            System.out.println();
//        }
    }
}
