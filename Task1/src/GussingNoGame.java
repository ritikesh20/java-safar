import java.util.Scanner;

public class GussingNoGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = (int)(Math.random()*1000);
       // System.out.println(ans);
        int gussingNo = 0;
        System.out.println("ENter Gussing No :");

        do {
            gussingNo = input.nextInt();

            if(gussingNo == ans){
                System.out.println("Congrats");
                break;
            } else if (gussingNo > ans) {
                System.out.println("No chhota Hai");
            }
            else {
                System.out.println("No bada hai");
            }

        }while (true);
    }
}
//import java.util.Scanner;
//
//public class Billing {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int choice = 0;
//
//        System.out.println("1 for panner\n 2 for moms ");
//        System.out.println("Enter choice ");
//        int sum = 0;
//
//        do {
//            choice = input.nextInt();
//            switch (choice) {
//                case 1 -> {
//                    int paneer = 0;
//                    System.out.println("Enter paner :");
//                    paneer = input.nextInt();
//
//                    int bill = paneer * 100;
//                    sum = sum + bill;
//                    System.out.println(bill);
//
//                    System.out.println("Oder Again");
//                    System.out.println("Enter 1 for oder again");
//                    choice = input.nextInt();
//                    int enter = input.nextInt();
//
//                    switch (enter){
//                        case  1 -> {
//                            System.out.println("Maggi");
//                            int maggi = input.nextInt();
//                            choice = input.nextInt();
//
//                            int x = maggi * 5;
//                            sum = sum + x;
//                        }
//                        case 2 -> {
//                            int moms = 0;
//                            System.out.println("Enter paner :");
//                            moms = input.nextInt();
//
//                            int amount = moms * 200;
//                            System.out.println(amount);
//                            sum = sum + amount;
//                        }
//                    }
//                }
//
//            }
//        }while (choice != 1);
//        // choice = input.nextInt();
//        System.out.println(sum);
//    }
//}
