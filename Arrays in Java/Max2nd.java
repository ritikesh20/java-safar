public class Max2nd {
    public static void main(String[] args) {

        int [] arr = {20,42,67,125,88};
//        int max  = arr[0];
//        int secMax = Integer.MAX_VALUE;
//        for (int i = 0; i<arr.length; i++){
//            if(arr[i] < max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//        for (int i = 0; i<arr.length; i++){
//            if(arr[i] < secMax  && arr[i] > max){
//                secMax = arr[i];
//            }
//        }
//        System.out.println(secMax);
//        int thirdMax = Integer.MAX_VALUE;
//        for (int i = 0; i<arr.length; i++){
//            if(arr[i] < thirdMax && arr[i] > max && arr[i] > secMax){
//                thirdMax = arr[i];
//            }
//        }
//        System.out.println(thirdMax);

        int max = 0;
        int secMax = 0;

        if(arr[0] > arr[1]){
            max = arr[0];
            secMax = arr[1];
        }
        else{
            max = arr[1];
            secMax = arr[0];
        }
        for (int i = 2; i<arr.length; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }
            else if (arr[i] > secMax){
                secMax = arr[i];
            }

        }

        System.out.println("Max :" + max);
        System.out.println("Second Max :" + secMax);
    }
}
