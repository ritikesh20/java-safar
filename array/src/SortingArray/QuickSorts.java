package SortingArray;


public class QuickSorts {
    public static void quickSorts(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = arr[arr.length - 1];
        System.out.println(pivot);
        quickSorts(arr, start, pivot);
        quickSorts(arr, pivot + 1, end);
    }

    public static int partition(int [] arr, int start , int end){
        int pivot = arr[end];
        int i = start -1;

        for (int j = start; j<end; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        i++;
        swap(arr,i,end);
        return i;
    }


    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // pivot & Portion

        int[] arr = {3, 5, 1, 8, 2, 4};

        quickSorts(arr, 0, arr.length - 1);

    }
}
