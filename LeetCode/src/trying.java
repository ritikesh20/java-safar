import java.util.ArrayList;

public class trying {
    public static void main(String[] args) {

        int[] arr = {3, 30, 34, 5, 9};
        ArrayList<Integer> list = new ArrayList<>();

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            if (arr[start] > 10) {
                int num = arr[start];
                while (num > 0) {
                    int rem = num % 10;
                    list.add(rem);
                    num = num / 10;
                }
            } else {
                list.add(arr[start]);
            }
            start++;
        }
        System.out.println(list);
    }
}



