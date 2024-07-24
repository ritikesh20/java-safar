import java.util.Scanner;

public class fabNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int no = 0;

        System.out.println("Enter No :");
        no = input.nextInt();
        int c = 0;

       for(int i = 0; i<no; i++) {
           c = a + b;
           System.out.print(a + " ");
           b = a;
           a = c;
       }
        System.out.println("A :" + a);
    }
}
