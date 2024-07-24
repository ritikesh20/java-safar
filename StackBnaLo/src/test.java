import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 7, 2};

        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        st.push(0);

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            while (x > st.peek()){
                st.pop();
            }

            if(st.peek() > x){
                list.add(st.push(x));
            }

            st.push(arr[i]);
        }

        System.out.println(list);
    }
}
