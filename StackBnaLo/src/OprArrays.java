import java.util.Stack;

public class OprArrays {
    public static void main(String[] args) {
//
//        String [] arr = {"5","2","C","D","+"};
//        Stack<Integer> st = new Stack<>();
//
//        for (int i = 0; i<arr.length; i++){
//            if(arr[i].equals("C")){
//                st.pop();
//            }
//            else if(arr[i].equals("D")){
//                int x = st.peek() * 2;
//                st.push(x);
//            }
//            else {
//                st.push(Integer.valueOf(arr[i]));
//            }
//        }
        String x = "55";
        int count = 0;
        for (int i = 0; i<x.length(); i++){
            char ch = x.charAt(i);
            if(ch > '0' || ch < '9'){
                count = count + (int) ch;
            }

        }
        System.out.println(count);
    }
}
