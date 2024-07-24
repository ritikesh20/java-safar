import java.util.Scanner;

public class billlll2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Choice :");
        int choice = input.nextInt();

        switch (choice){
            case 1 -> {
                System.out.println("Hello");
                System.out.println("Enter choice again");
                int moms = 0;
                System.out.println("Enter paner :");
                moms = input.nextInt();

                int amount = moms * 200;
                System.out.println(amount);
                System.out.println("Ch");
                choice = input.nextInt();
            }
        }
    }
}