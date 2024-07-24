import java.util.Arrays;

public class DivideOddEven {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        int i = 0;
        int j = 0;
        int k = 0;
        int [] even = new int[arr.length-1];
        int [] odd = new int[arr.length-1];
        for ( i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                even[j] = arr[i];
                j++;
            }
            else{
                odd[k] = arr[i];
                k++;
            }
        }
        System.out.println("Even No :");
        for (i = 0; i<j; i++){
            System.out.print(even[i] + " ");
        }
        System.out.println("odd No :");
        for (i = 0; i<k; i++){
            System.out.print(odd[i] + " ");
        }


    }
}
