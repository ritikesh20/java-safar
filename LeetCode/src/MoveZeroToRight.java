import java.util.Arrays;

public class MoveZeroToRight {
    public static void main(String[] args){

        int [] arr = {0,0,0,3,1,4};

        int start = 0;
        int end = start + 1;


        while (end <= arr.length-1){
            if(arr[end] != 0 ){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end++;
            }
            else{
                end++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
