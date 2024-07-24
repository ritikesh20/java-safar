public class MaxWithIndex {
    public static void main(String[] args) {

       int [] arr = {1,12,12,3455,56,12,67,675};
       int max = 0;

       for (int i = 1; i<arr.length; i++){
           if(arr[i] > arr[max]){
               max = i;
           }
       }
        System.out.print("Max :" + arr[max] + "\nMax Index :" + max );
    }
}
