public class MedianArrays {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        int len = arr.length;
        //System.out.println(len);
        if(len % 2 == 0){
            int y = len/2;
            int a = arr[y];
            System.out.println(a);
            int b = arr[y-1];
            System.out.println(b);
            double result = (double) (a + b) / 2;
            System.out.println(result);

        }
        else {
            int x  = len/2;
            System.out.println(x);
            int ans = len = x;
            System.out.println(arr[x]);
        }
    }
}
