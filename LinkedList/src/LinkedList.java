public class LinkedList {
    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {

        Node newNode = new Node(data);// S1 - create new Node
        if (head == tail) {
            head = tail = newNode;
            return;
        }
        //step 2 newNode next = head
        newNode.next = head;

        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == tail) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {

        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.print();
        ll.addFirst(5);
        ll.print();
        ll.addFirst(20);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(40);
        ll.print();
        ll.addLast(50);
        ll.print();

    }
}