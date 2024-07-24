public class subArrays {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};
        int [] com = {1,9,3};
        int count = 0;

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int j = 0; j<com.length; j++) {
            System.out.print(com[j] + " " );
        }

        System.out.println();
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<com.length; j++) {
               if(arr[i] == com[j]){
                   count++;
                   break;
               }
            }
        }
        if(count == com.length){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}