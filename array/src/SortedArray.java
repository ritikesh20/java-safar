public class SortedArray {
    public static void main(String[] args) {

        int [] arr = { 1, 5, 8, 9, 10, 15 };
        int count = 0;
        int size = arr.length-1;

        for (int i = 0; i<arr.length; i++){
            for (int j = i; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
