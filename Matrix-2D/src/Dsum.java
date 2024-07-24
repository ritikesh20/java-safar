import java.util.ArrayList;

public class Dsum {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 9, 10}};
                //{{1, 1, 1, 1}, {1, 1, 1, 1,}, {1, 1, 1, 1,}, {1, 1, 1, 1,}};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                    list.add(arr[i][j]);
            }
            System.out.println();
        }
//
//        for (int i = arr.length-1; i>=0; i--){
//            for (int j = arr.length-1; j>=0; j--){
//                if (i == j) {
//                    list.add(arr[i][j]);
//                }
//            }
//        }
       System.out.println(list);
    }
}
