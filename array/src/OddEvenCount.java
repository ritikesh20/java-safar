public class OddEvenCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 4,2};

        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Array");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                evenCount++;
            }
            else  {
                oddCount++;
            }
        }
        System.out.println();
        System.out.println("Even C :" + evenCount);
        System.out.println("Odd C :" + oddCount);
    }
}
