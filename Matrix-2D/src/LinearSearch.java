public class LinearSearch {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        boolean ans = false;
        int x = 5;
        int index = -1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == x) {
                    ans = true;
                    index = arr[i][j];
                    break;
                }
            }
        }
        System.out.println(ans);
        System.out.println(index);
    }
}
