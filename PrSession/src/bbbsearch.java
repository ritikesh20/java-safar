public class bbbsearch {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,45};

        int x = 6;
        int start = 0;
        int index = -1;
        int end = arr.length-1;


        while (start <= end){
            int mid = (start + end) /2;
            if(arr[mid] == x){
                index = mid;
                break;
            }
            if(arr[mid] > x){
                end = mid - 1;
            }
            if(arr[mid] < x){
                start = mid + 1;
            }
        }
        // start + (end - start)/2;

        System.out.println(index);
    }
}
