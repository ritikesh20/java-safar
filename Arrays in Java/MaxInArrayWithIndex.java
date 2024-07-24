public class MaxInArrayWithIndex {
    public static void main(String[] args) {

        int [] arr = {87,12,999,34,56,67,675};
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("Max No : " + max + "\nMax Index : " + maxIndex );

    }
}
