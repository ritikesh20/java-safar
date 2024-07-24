public class FunArrays {

    public static void printArrays(int arr[], int k){

        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(k);
    }
    public static void main(String [] args){

        int [] arr = {1,2,3,4,5};
        int k = 6;

        printArrays(arr,k);

    }
}
