package SortingArray;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {6, 7, 3, 2, 9};
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
