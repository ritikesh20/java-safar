import java.util.HashMap;

public class llByMe {
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

        void addAtIndex(int index, int element) {
            listnode newElement = new listnode(element);
            listnode start = head;

            if (index == 0) {
                addHead(element);
                return;
            } else if (index == size()) {
                addTail(element);
                return;
            }
            for (int i = 1; i <= index - 1; i++) {
                start = start.next;
            }
            newElement.next = start.next;
            start.next = newElement;
        }

        void addTail(int element) {
            listnode lastNode = new listnode(element);
            if (tail == null) {
                head = lastNode;
                tail = lastNode;
            } else {
                tail.next = lastNode;
                tail = lastNode;
            }
        }

        void deleteHead() {
            if (head != null) {
                head = head.next;
            }
        }

        void deleteAtIndex(int position) {
            if (head == null) {
                return;
            } else if (position == 0) {
                head = head.next;
            }
            listnode start = head;
            int index = 0;

            while (start != null && index < position - 1) {
                start = start.next;
                index++;
            }
            if (start == null || start.next == null) {
                return;
            }
            start.next = start.next.next;

        }

        void deleteTail() {
            listnode start = head;

            while (start.next.next != null) {
                start = start.next;
            }
            start.next = null;
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

        void search() {
            listnode start = head;
            int x = 65;
            boolean ans = false;

            while (start != null) {
                if (start.data == x) {
                    ans = true;
                }
                start = start.next;
            }
            System.out.println("Ans : " + ans);
        }

        void display() {
            listnode start = head;
            while (start != null) {

                System.out.print(start.data + " ");
                if (start.next == null) {
                    return;
                }
                start = start.next.next;

            }
        }

        void mapHead() {
            listnode cur = head;
            HashMap<Integer, Integer> map = new HashMap<>();
            while (cur != null) {
                if(map.containsKey(cur.data)){
                    int count = map.get(cur.data);
                    map.put(cur.data,count + 1);
                }
                else {
                    map.put(cur.data, 1);
                }
                cur = cur.next;
            }
            System.out.println(map);
            for (int arr : map.keySet()){
                if(map.get(arr) == 1){

                }
            }
        }
    }


    public static void main(String[] args) {
        linkList ll = new linkList();

        ll.addHead(5);
        ll.addHead(4);
        ll.addHead(3);
        ll.addHead(2);
        ll.addHead(1);
//        ll.addTail(4);
//        ll.addTail(5);

//        ll.addAtIndex(1, 34);
//        ll.addAtIndex(4, 64);
//        ll.addAtIndex(0, 0);
//        ll.addAtIndex(8, 100);
//        ll.deleteHead();
//        ll.deleteTail();
//        ll.deleteAtIndex(1);
//        ll.deleteAtIndex(0);
        ll.search();
        int count = ll.size();
        System.out.println("Count = " + count);
        ll.display();
        ll.mapHead();

    }
}
