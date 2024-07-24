import java.util.Arrays;

public class bSort {
    public static void main(String[] args) {

        int [] arr = {1,99,45,6,6,7,56,9,2,3,4,5,6};
        int n = arr.length;

        for (int i = 0; i<n-1; i++){
            // n = 5
            // 5 - 1; // n = 5
            // 4 - i// ka value
            // check kara hai ki
            for(int j = 0; j<n-1-i; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
