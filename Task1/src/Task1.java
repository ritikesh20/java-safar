import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ab,ac,bc = 0;
        System.out.println("Enter Ab :");
        ab = input.nextInt();
        System.out.println("Enter AC :");
        ac = input.nextInt();
        System.out.println("Enter CB :");
        bc = input.nextInt();

        if(ab == ac && ab == bc && bc == ab){
            System.out.println("Equilateral");
        }
        else if (ab==ac || ac == bc || bc == ab) {
            System.out.println("isosceles");
        }
        else if ( ab != ac && ab != bc && bc != ab) {
            System.out.println("scalene");
        }
        else {
            System.out.println("inVaild Entery");
        }
    }
}
