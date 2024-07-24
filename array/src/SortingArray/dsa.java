package SortingArray;

public class dsa {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }
    public static class linkedlist{
        node head = null;

        void add(int data){
            node newHead = new node(data);

            newHead.next = head;
            head = newHead;
        }

        void display(){
            node start = head;

            while (start != null){
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

        int size(){
            int count = 0;
            node start = head;

            while (start != null){
                count++;
                start = start.next;
            }
            return count;
        }
    }



    public static void main(String[] args){

        linkedlist ll = new linkedlist();

        ll.add(45);

        for (int i = 10; i>= 0; i--){

        }



        ll.display();
        int size = ll.size();
        System.out.println("Size :" + size);
    }

}
