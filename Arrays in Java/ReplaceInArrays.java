import java.util.Scanner;
public class ReplaceInArrays{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {4,5,9,11,23,45};
        int pos ;
        System.out.println("Enter Positon");
        pos = input.nextInt();
        int size = arr.length+1;

        int data = 34;
        System.out.println("Enter data :");
        data = input.nextInt();

        for(int i = size; i>pos; i--){
            arr[i] = arr[i-1];
        }
        size++;

        for (int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
