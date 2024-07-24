public class MedianOFArrays {
    public static void main(String[] args) {


       // int [] arr = {1,3,3,6,7,8,9};
        int [] arr = {1,2,3,  10, 20,  6,7,8,9};
        int size = arr.length-1;
        System.out.println(size);
//        int m1 = size / 2;
//        int m2 = (size + 2) / 2;
        int md1 = 0;
        int md2 = 0;
//        System.out.println("M1 = " + m1);
//        System.out.println("M1 = " + m2);

        for (int i = 0; i<arr.length; i++){
            md1 = (size -1 )/2;
            md2 = md1 + 1;
        }
        System.out.println(md1);
        System.out.println("MD1 = " + arr[md1]);
        System.out.println("MD2 = " + arr[md2]);

        double ans = 0;
        ans = (double) (arr[md1] + arr[md2])/2;
        System.out.println(ans);

    }





}
