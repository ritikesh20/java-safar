public class PeakElement {

    public static void main(String[] args) {

        int N = 7, x = 19;
        int arr[] = {1,2,8,10,11,12,19};

        int start = 0;
        int end = N;
        int index = -1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] == x){
                index = mid;
                break;
            }
            if (arr[mid] < x) {
                index = mid;
                start = mid + 1;
            }
            else {
                end = mid-1;
            }
        }
        System.out.println(index);
    }
}
