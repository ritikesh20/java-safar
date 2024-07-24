import java.util.Scanner;
public class DeleteFromArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7};

        int size = arr.length;
        int pos = 0;

       System.out.println("Pos :");
       pos = input.nextInt();
        int i = 0;
        System.out.println("Arrays");
        for (i = 0; i< size; i++){
            System.out.print(arr[i] + " ");
        }
        for (i = pos - 1; i< size-1; i++){
            arr[i] = arr[i+1];
            //arr[i+1] = arr[i];
        }
        size--;
        System.out.println();
        System.out.println("Arrays After Deletion");
        for (i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}