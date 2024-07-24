
public class inter {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public static class playLL {

        node khopari = null;

        node addKhopri(int data) {
            node newKhopri = new node(data);

            newKhopri.next = khopari;
            khopari = newKhopri;
            return newKhopri;
        }
        void print(){
            node current = khopari;

            while (current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
        }

        void add (){
            node c = khopari;
            int sum = 0;
            while (c != null){
                sum = sum + c.data;
            }
            System.out.println("Sum" + sum);
        }
    }



    public static void main(String[] args) {

        playLL a = new playLL();
        playLL b = new playLL();

        a.addKhopri(3);
        a.addKhopri(4);
        a.addKhopri(2);
        
        a.print();
        System.out.println();
        a.add();
        b.print();
    }
}
