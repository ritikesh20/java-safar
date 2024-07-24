import java.util.Stack;

public class removeInStack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> newStack = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        int index = 2;

        while (st.size() > index) {
            newStack.push(st.pop());
        }

        st.pop();

        while (newStack.size() > 0) {
            st.push(newStack.pop());
        }
        System.out.println(st);
        System.out.println(st);


    }
}
