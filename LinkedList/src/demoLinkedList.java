public class demoLinkedList {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {

        node head = null;

        void addHead(int data) {
            node newHead = new node(data);

            newHead.next = head;
            head = newHead;
        }

        void display() {
            node start = head;

            while (start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

        void sumLinkedList() {
            int sum = 0;
            node start = head;

            while (start != null) {
                sum = sum + start.data;
                start = start.next;
            }
            System.out.println("Sum = " + sum);
        }

        void oddEven() {
            node current = head;
            int evenSum = 0;
            int oddSum = 0;
            while (current != null) {
                if (current.data % 2 == 0) {
                    System.out.print(current.data + " ");
                    evenSum = evenSum + current.data;
                } else {
                    oddSum = oddSum + current.data;
                }
                current = current.next;
            }
            System.out.println();
            System.out.println("Even Sum = " + evenSum);
            System.out.println("Odd Sum = " + oddSum);
        }

    }

    public static void main(String[] args) {

        linkedlist lk = new linkedlist();

//        lk.addHead(5);
//        lk.addHead(10);
//        lk.addHead(15);
//        lk.addHead(20);
//        lk.addHead(25);
        for (int i = 0; i <= 10; i++) {
            lk.addHead(i);
        }
        lk.oddEven();

        lk.display();
        lk.sumLinkedList();
    }
}
