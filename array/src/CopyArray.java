import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {

        int [] arr = {1,9,1,1,3,3,5,6};
        Arrays.sort(arr);
        int [] xArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                xArr[j++] = arr[i];
            }
        }
        xArr[j++] = arr[arr.length-1];

        for (int k = 0; k<j; k++){
            System.out.print(xArr[k] + " ");
        }
    }
}
