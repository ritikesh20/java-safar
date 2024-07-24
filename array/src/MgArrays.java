public class MgArrays {
    public static void main(String[] args) {

        int [] arr = {-7, 1, 5,  2, -4, 3, 0};
        int n = 3;
        int sum = 0;
        int add = 0;
        int i = 0;

        for (i = 0; i<arr.length; i++){
            if(i <n){
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
        for ( i = n+1; i < arr.length; i++){
            add = add + arr[i];
        }
        System.out.println(add);
        if(sum == add){
            System.out.println(i);
        }
    }
}
