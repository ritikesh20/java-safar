import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> revStack = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        // Ways 1
//        while (st.size() > 0){
//            System.out.println(st.size());
//            int top = st.peek();
//            revStack.push(top);
//            st.pop();
//        }
        // Ways 2

        while (st.size() > 0){
            revStack.push(st.pop());
        }
        System.out.println(revStack);

    }
}
