public class ZeroMoving {
    public static void main(String[] args) {

        int[] arr ={0,2,2,2,2,1,1,1,1,0,0,0};
        // {0,0,-40, -0, 0, 8, 5,1,6,0,0,0,0,0};
        int size = arr.length;
        int noneZero = 0;
        int zero = 0;

        while (noneZero < size){
            if(arr[noneZero] == 0){
                int temp = arr[noneZero];
                arr[noneZero] = arr[zero];
                arr[zero] = temp;

                noneZero++;
                zero++;
            }
            else {
                noneZero++;
            }
        }

        for(int i = 0 ; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
