public class OccurenceOfArrays {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 3, 3, 5};

        int x = 3;
        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 3) {
                count = 0;
                continue;
            } else {
                count++;
                max = Math.max(count, max);
            }
        }
        System.out.println(max);
    }
}
