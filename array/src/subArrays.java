public class subArrays {
    public static void main(String[] args) {

        int[] arr = {3, 34, 4, 12, 5, 2};


        for (int i = 0; i < arr.length; i++) {
            int start = i;

            // star is picking 2 that is starting point
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                int end = j;
                // end is picking last elements of arrays
                for (int k = start; k <= end; k++) {
// k is printing b/t starting to ending elements included start of end
                    sum = sum + arr[k];
                    System.out.print(arr[k] + " ");

                }
                System.out.println(" Sum " + sum + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
