public class BinSearch {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10,45,67};
        int x = 1;

        int start = 0;
        int end = arr.length-1;
        int index = -1;
        int mid = 0;
        mid = (start + end) / 2;


        while (start<=end){

            if(arr[mid] == x){
                index = x;
            }
            else if(arr[mid] > x){
                start = mid + 1;
                index = x;
            }
            else if (arr[mid] < x){
                end = mid - 1;
                index = x;
                break;
            }
            else {
                System.out.println("X is Not founded");
            }
        }
        System.out.println(index);
    }
}
