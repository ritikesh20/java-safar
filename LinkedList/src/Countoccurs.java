public class Countoccurs {
    public static class listNode {
        int data;
        listNode next;

        listNode(int data) {
            this.data = data;
        }
    }

    public static class OccursList {
        listNode head = null;

        void addData(int data) {
            listNode newHead = new listNode(data);

            newHead.next = head;
            head = newHead;
        }

        void display() {
            listNode start = head;

            while (start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

        void remove(int pos) {

            listNode current = head;
            int index = 0;
            while (current != null && index <= pos) {
                current = current.next;
                index++;
            }
//            if (current == null || current.next == null) {
//                return;
//            }
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {

        OccursList llist = new OccursList();

        llist.addData(5);
        llist.addData(7);
        llist.addData(10);
        llist.addData(14);
        llist.addData(20);
        llist.addData(44);



        llist.display();
        System.out.println();
        llist.remove(2);
        llist.display();

    }
}
