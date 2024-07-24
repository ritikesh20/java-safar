package SortingArray;

import java.util.Arrays;

public class MargeSort {
    public static void divide(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (end - start) / 2 + start;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    public static void conquer(int[] arr, int start, int mid, int end) {

        int[] tempArr = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                tempArr[k++] = arr[i++];
            } else {
                tempArr[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            tempArr[k++] = arr[i++];
        }
        while (j <= end) {
            tempArr[k++] = arr[j++];
        }

        for (int p = 0, idx = start; p < tempArr.length; idx++, p++) {
            arr[idx] = tempArr[p];
        }
    }


    public static void main(String[] args) {

        int[] arr = {8, 4, 9, 2, 1, 6};

        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        //Tc (nlog n)
        // sc 0(n)

    }
}
