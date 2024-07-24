public class PalindromeArrays {
    public static void main(String[] args) {


        int[] arr = {5, 5, 9, 5,5};

        boolean ans = true;
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            if(arr[start] != arr[end]) {
                ans = false;
            }
            start++;
            end--;
        }
        //System.out.println(ans);
        if(ans == true){
            System.out.println("Given Arrays is A Palindrom");
        }
        else {
            System.out.println("No A Palindrom");
        }
    }
}
