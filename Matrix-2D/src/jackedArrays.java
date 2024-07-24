import java.util.Scanner;

public class jackedArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = 0;
        System.out.println("Enter Row");
        row = input.nextInt();

        int [][] arr = new int[row][];
        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[2];

        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                arr[i][j] =input.nextInt();
            }
        }
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
