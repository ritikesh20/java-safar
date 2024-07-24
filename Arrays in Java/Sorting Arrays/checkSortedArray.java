package SortingArray;

import java.util.Scanner;

public class checkSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = { 1, 5, 8, 9, 10, 15};
        int count = 0;
        int size = arr.length-1;
        for (int i = 0; i<arr.length-1; i++){
            if(arr[i] < arr[i + 1]){
                count++;
            }
        }
        if(count == size){
            System.out.println("Arrays is  Sorting");
        }
        else {
            System.out.println("Array is not Sorted");
        }
    }
}
