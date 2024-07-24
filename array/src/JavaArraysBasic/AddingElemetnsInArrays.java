package JavaArraysBasic;

import java.util.Scanner;
public class AddingElemetnsInArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


      int size,data,pos;

        System.out.println("Enter Size :");
        size = input.nextInt();

        int [] arr = new int [size + 1];
        System.out.println("Enter Array :");
        for (int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Position :");
        pos = input.nextInt();

        System.out.println("Enter Data :");
        data = input.nextInt();

        for (int i = size; i>pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = data;
        size++;

        for (int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }









    }
}
