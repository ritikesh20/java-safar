import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7,8,9,45,5,6};


        int x = 45;
        int index = -1;

        for (int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                index = i;
                break;
            }
        }
        System.out.println(index);

    }
}
