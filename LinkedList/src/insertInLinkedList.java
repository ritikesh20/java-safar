public class insertInLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {// linkedlist is a class data structure
        Node head = null;
        Node tail = null;

        void insertAtHead(int val) {
            Node newHead = new Node(val);
            if (head == null) {// agar linkedlist khali hai to
                head = newHead;
                tail = newHead;
                // head = tail = null; // in one line
            } else {// agar linked list me ek v elements hai to
                newHead.next = head;
                head = newHead;
            }
        }

        void insertAtIndex(int index, int val) {
            Node newElement = new Node(val);
            Node start = head; // start loop pr travers karne ke liye hai

            if (index < 0 || index > size()) {
                System.out.println("Wrong Index ");
                return;
            } else if (index == 0) {
                insertAtHead(val);
                return;
            } else if (index == size()) {
                insertAtEnd(val);
                return;
            }
            for (int i = 1; i <= index - 1; i++) {//index = 3 it's means ye 2 tak chale 0,1,2
                start = start.next;
            }
            // newElement ko add kr do start.next se
            newElement.next = start.next;
            start.next = newElement;
        }

        void insertAtEnd(int val) {
            // Make A node
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
                tail = temp;
            }
            else {
                tail.next = temp;// tail.next = hoga gya tamp ke
                tail = temp;
            }

        }

        void getElementAtIndex(int indexAt) {
            Node start = head;
            for (int i = 1; i <= indexAt; i++) {
                start = start.next;
            }
            System.out.println("Index = " + start.data);
        }


        void display() {
            Node start = head;
            while (start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
            System.out.println();
        }

        int size() {
            int count = 0;
            Node start = head;
            while (start != null) {
                count++;
                start = start.next;
            }
            // if function is void
            //System.out.println();
            //System.out.println("Size = " + count);
            return count;
        }

        void deleteAtIndex(int inxDelete) {
            Node start = head;

            for (int i = 1; i < inxDelete; i++) {
                start = start.next;
            }
            if (inxDelete == size() - 1) {
                tail = start;
                return;
            } else {
                start.next = start.next.next;
                // tail = start.next;
            }


        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        ll.insertAtHead(45);
        ll.display();
        ll.insertAtEnd(5);
        ll.display();
        ll.insertAtEnd(6);
        ll.display();
        ll.insertAtEnd(7);
        ll.display();
        ll.insertAtHead(3);
        ll.display();
        ll.insertAtHead(1);
        ll.display();
        ll.insertAtEnd(10);
        ll.display();
        ll.insertAtHead(0);
        ll.display();
        ll.insertAtIndex(4, 4);
        ll.display();
        ll.insertAtIndex(0, 20);
        ll.display();
        ll.insertAtEnd(99);
        ll.display();
        ll.getElementAtIndex(10);
        //ll.deleteAtIndex(4);
        ll.display();
        ll.deleteAtIndex(10);
        ll.display();

        System.out.println("Head At = " + ll.head.data);
        System.out.println("Tail At = " + ll.tail.data);
        ll.display();


        System.out.println();
        System.out.println("Size = " + ll.size());

    }
}
