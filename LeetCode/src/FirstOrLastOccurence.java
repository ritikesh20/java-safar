public class FirstOrLastOccurence {
    public static void main(String[] args) {

        int [] arr = {0,0,1,1,2,2,2,2,5};
        int x = 2;
        int index = -1;
        int last = -1;

        for (int i = 0; i<arr.length; i++){
            if(arr[i] == 2){
                index = i;
                break;
            }
        }

        System.out.println(index);
        for (int i = arr.length-1; i>=0; i--){
            if(arr[i] == x ){
                last = i;
                break;
            }
        }
        System.out.println(last);
    }
}