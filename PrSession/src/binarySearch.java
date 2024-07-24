public class binarySearch {
    public static void main(String[] args) {

        int [] arr = {34,54,23,76,89};

        int x = 54;
        int ans = -1;

        int start = 0;
        int end = arr.length-1;

        while (start<=end){

            int mid = (start+end) / 2;

            if(arr[mid] == x){
                ans = mid;
                break;
            }
            if(arr[mid] > x){
                end = mid-1;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
