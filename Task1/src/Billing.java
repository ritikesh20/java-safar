import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        int sum = 0;
        int flag;
        do {
            int choice = 0;
            System.out.println("1 for panner\n 2 for moms ");
            System.out.println("Enter choice ");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    int paneer = 0;
                    System.out.println("Enter paner :");
                    paneer = input.nextInt();

                    int bill = paneer * 100;
                    sum = sum + bill;
                    System.out.println(bill);
                }
                case 2 -> {
                    int moms = 0;
                    System.out.println("Enter paner :");
                    moms = input.nextInt();

                    int amount = moms * 200;
                    System.out.println(amount);
                    sum = sum + amount;
                }
            }
            System.out.println("Enter 0 for stopping program other press any number");
            flag = input.nextInt();
        } while (flag!=0);
        System.out.println(sum);
    }
}

