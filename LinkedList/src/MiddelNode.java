public class MiddelNode {

    public static class myNode {
        int data;
        myNode next;

        myNode(int data) {
            this.data = data;
        }
    }

    public static class myLinkedList {

        myNode head = null;

        void add(int data) {
            myNode newhead = new myNode(data);

            newhead.next = head;
            head = newhead;
        }


        void display() {
            myNode start = head;

            while (start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

        void middle(int m) {
            myNode start = head;

            for (int i = 0; i <= m; i++) {
                start = start.next;
            }
            System.out.println("Middle Element = " + start.data);
        }

        void occurs() {
            int oc = 5;
            int count = 0;
            myNode start = head;

            while (start != null) {
                if (start.data == oc) {
                    count++;
                }
                start = start.next;
            }
            System.out.println();
            System.out.println("Occurs Count = " + count);
        }

        int size() {
            int count = 0;
            myNode start = head;
            while (start != null) {
                count++;
                start = start.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {

        myLinkedList myll = new myLinkedList();

        myll.add(70);
        myll.add(60);
        myll.add(50);
        myll.add(40);
        myll.add(30);
        myll.add(20);
        myll.add(10);
        int size = myll.size();
        System.out.println("Size = " + size);

        myll.display();
        myll.occurs();
        int m = size / 2;
        System.out.println();
        System.out.println("Mid = " + m);
        myll.middle(m - 1);

    }
}
