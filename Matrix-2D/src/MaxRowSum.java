public class MaxRowSum {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int MaxRowIndex = -1;

        int max = Integer.MIN_VALUE;
        System.out.println("Row Sum");
        for (int i = 0; i < 3; i++) {
            int add = 0;
            for (int j = 0; j < 3; j++) {
                //col Wise sum
                add = add + arr[i][j];
            }
            System.out.println(add);

            if (add > max) {
                max = add;
                MaxRowIndex = i;
            }
        }
        System.out.println("Max Row Sum");
        System.out.println(max);
        System.out.println(MaxRowIndex);
    }
}
