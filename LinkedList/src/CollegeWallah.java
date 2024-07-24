public class CollegeWallah {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void recursionDisplay(Node head) {
        //base case
        if (head == null) {
            return;
        }

        recursionDisplay(head.next);// calling for nextNode
        System.out.print(head.data + " ");
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {

            System.out.print(start.data + " ");
            start = start.next;
        }

    }
    public static void funCount(Node head,int count){

        while (head != null){
            count++;
            head = head.next;
        }
        System.out.println();
        System.out.println("Length of Linked List = " + count);
    }

    public static void main(String[] args) {

        Node head = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);

        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        int count = 0;

        // passing head to display Function
        System.out.println("Normal Function call");
        display(head);
        System.out.println();
        System.out.println("Normal Recursion Function call");
        recursionDisplay(head);

        // printing Node using for loop
        // Node start = head;
//        for (int i = 1; i <=5 ; i++) {
//            System.out.print(start.data + " ");
//            start = start.next;
//        }

        // printing Node using while Loop

        // Node start = head;
//        while(start != null){
//            count++;
//            System.out.print(start.data + " ");
//            start = start.next;
//        }

        //Making function count linked list length
        funCount(head,count);





    }
}
