import java.util.Scanner;

public class disArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arr = new int[3];
        int i = 0;

        System.out.println("Enter Elements");
        for (i = 0; i<arr.length;i++){
            arr[i] = input.nextInt();
        }

        for (i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
