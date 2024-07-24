public class RowsSum {
    public static int rowSum(int[][] arr) {
        System.out.println("Row By Sum......");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println(sum);
        }
        return sum;
    }

    public static int maxRowSum(int[][] arr) {
        int sum = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println("Max :" + max);
        return max;
    }

    public static int colomSum(int[][] arr) {
        System.out.println("colom By Sum......");
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[j][i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 73}, {4, 5, 6}, {7, 9, 10}};
        System.out.println("-------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int x = rowSum(arr);
        int cSum = colomSum(arr);
        int maxRSum = maxRowSum(arr);
    }
}



