
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    static void print(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    static  void odd(Node head){
        
    }


//    public static void indexAt(Node head, int indx) {
//        Node start = head;
//        int end = 0;
//
//        for (int i = 1; i < indx ; i++) {
//            start = start.next;
//            end = i;
//        }
//        System.out.println("Index At : " + start.data);
//        System.out.println("End end = " + end);
//    }

    public static void main(String[] args) {
        Node N1 = new Node(11);
        Node N2 = new Node(22);
        Node N3 = new Node(35);
        Node N4 = new Node(40);
        Node N5 = new Node(55);
        Node N6 = new Node(60);

        Node head = N1;
        head.next = N2;
        N2.next = N3;
        N3.next = N4;
        N4.next = N5;
        N5.next = N6;
        N6.next = null;


        print(head);
    }
}
