public class DuInArrays {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,5,3,2,1};


        for (int i = 0; i<arr.length; i++){
            for (int j = i + 1; j<arr.length; j++){
                if(arr[i] == arr[i+1]){
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
}
