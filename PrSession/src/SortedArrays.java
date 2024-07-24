public class SortedArrays {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,5,5,6};
        int size = arr.length-1;
        int count = 0;
        for (int i = 0; i<size; i++){
            if(arr[i] <= arr[i+1]){
                count++;
            }
        }

        System.out.println(size == count);
//        if(count == size){
//            System.out.println("Array is Sorted");
//        }
//        else {
//            System.out.println("Not A Sorted Array");
//        }
    }
}
