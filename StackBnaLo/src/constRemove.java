import java.util.Stack;

public class constRemove {

    public static int[] removeCopy(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (st.size() == 0 || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (arr[i] == st.peek()) {
                if (arr[i] != arr[i + 1]) {
                    st.pop();
                }
            }
        }
        int[] res = new int[st.size()];
        int s = res.length;

        for (int i = s - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};

        int[] res = removeCopy(arr);

        for (int i = 0; i < res.length - 1; i++) {
            System.out.print(res[i] + " ");
        }
    }
}