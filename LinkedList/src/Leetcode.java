public class Leetcode {
    public static class listnode {
        int data;
        listnode next;

        listnode(int data) {
            this.data = data;
        }
    }

    public static class linkList {

        listnode head = null;
        listnode tail = null;

        void addHead(int element) {
            listnode newhead = new listnode(element);

            if (head == null) {
                head = newhead;
                tail = newhead;
            } else {
                newhead.next = head;
                head = newhead;
            }
        }

        int size() {
            int count = 0;
            listnode start = head;

            while (start != null) {
                count++;
                start = start.next;
            }
            return count;
        }


        void display() {
            listnode start = head;
            while (start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

    }


    public static void main(String[] args) {
        linkList ll = new linkList();

        ll.addHead(7);
        ll.addHead(4);
        ll.addHead(6);
        ll.addHead(5);
        ll.addHead(3);
        ll.addHead(1);
        ll.addHead(2);




        ll.display();

    }
}
