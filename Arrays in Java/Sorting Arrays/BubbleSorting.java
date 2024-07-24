package SortingArray;

public class BubbleSorting {
    public static void main(String[] args) {

        int [] arr = {3,1,67,43,2,9,45};
        int size = arr.length-1;

        for (int i = 0; i<size; i++){
            for (int j = 0; j<size - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
