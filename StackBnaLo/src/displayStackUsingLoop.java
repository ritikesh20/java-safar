import java.util.Arrays;
import java.util.Stack;

public class displayStackUsingLoop {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        int size = st.size();
        int[] arr = new int[size];

        // put stack element in stack in reverse order
        for (int i = size - 1; i >= 0; i--){
            arr[i] = st.pop();
        }


        System.out.println(st);

        // print element from 0th index to nth index and push it in stack in same order
        for (int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }

        System.out.println();
        System.out.println(st);
    }
}

//        int indx = 2;
//        int element = 45;
//        if(indx > st.size()){
//            System.out.println("index out bound");
//        }
//
//        while (st.size() > indx){
//
//            newStack.push(st.pop());
//        }
//        newStack.push(element);
//
//        while (newStack.size() > 0 ){
//            st.push(newStack.pop());
//        }
//
//        System.out.println(st);