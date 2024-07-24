import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(7);


        System.out.print(st + " ");
        int peek = st.peek();
        System.out.println();
        System.out.println("Top element = " + peek);
        int size = st.size();
        System.out.println("Size : " + size);



    }
}