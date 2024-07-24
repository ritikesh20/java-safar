public class BinaryCount {
    public static void main(String[] args) {

        int [] arr = {1,1,1,1,1,0,1,1,1,1,0};
        int count = 0;
        int max = 0;

        for (int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                count = 0;
                continue;
            }
            else {
                count++;
                max = Math.max(count,max);
            }
        }
        System.out.println(max);
    }
}
