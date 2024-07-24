public class MountMax {
    public static void main(String[] args) {

        int []arr = {0,10,99,5,2};
//        int max = 0;
//        int index = -1;
//
//        for(int i = 0; i<arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//                index = i;
//            }
//        }
        //System.out.println(max);
        //System.out.println(index);


                int i = 0;
                while (arr[i] < arr[i + 1]) {
                    i++;
                }
        System.out.println(i);

    }
}
