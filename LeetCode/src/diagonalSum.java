import java.util.ArrayList;
import java.util.HashSet;

public class diagonalSum {
    public static void main(String[] args) {

        int [] [] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int size = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
//        for (int i = 0; i<arr.length; i++){
//            for (int j = 0; j<arr.length; j++){
//                if(i == j){
//                    list.add(arr[i][j]);
//                }
//            }
//        }
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<i+1; j++){
                if(i == j){
                    list.add(arr[i][j]);
                }
            }
        }

        System.out.println(list);

        if(size % 2 == 0){

        }
    }
}
