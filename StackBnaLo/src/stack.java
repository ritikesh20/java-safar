public class stack {
    public static class stacks {
        int[] arr = new int[5];
        int index = -1;
        int count = 0;

        void push(int val) {
            if (index == count -1) {
                System.out.println("Stake khali hai");
                return;
            }
            index++;
            arr[index] = val;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Stake khali hai");
                return -1;
            }
            return arr[index];
        }


        int pop() {
            if (isEmpty()) {
                System.out.println("Stake khali hai");
                return -1;
            }
            int top = arr[index - 1];
            arr[index - 1] = 0;
            index--;
            return top;
        }

        int size() {

            for (int i = 0; i < index; i++) {
                count++;
            }
            return count;
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public boolean isEmpty() {
            return index == -1;
        }

        boolean isFull() {
            return index == size() - 1;
        }
    }

    public static void main(String[] args) {

        stacks st = new stacks();

        st.push(45);
        st.push(43);
        st.push(49);
        st.push(45);
        st.push(43);
        st.push(43);

        st.display();


    }
}
