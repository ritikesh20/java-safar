public class unArrays {
    public static void main(String[] args) {
        int [] arr = {11,11,12,14,14};
        int ans = 0;
        for (int i = 0; i<arr.length; i++){
            ans = ans^arr[i];
        }
        System.out.println(ans);
    }
}
