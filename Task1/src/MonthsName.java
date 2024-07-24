import java.util.Scanner;

public class MonthsName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = 0;
        System.out.println("Enter Month No for Months Days");
        month = input.nextInt();

        if(month == 1){
            System.out.println("31 Days");
        }
        else if (month == 2) {
            System.out.println("28,29 Days");
        }
        else if (month == 3) {
            System.out.println("31Days");
        }
        else if (month == 4) {
            System.out.println("30 Days");
        }
        else if (month == 5) {
            System.out.println("31 Days");
        }
        else if (month == 6) {
            System.out.println("30 Days");
        }
        else if (month == 7) {
            System.out.println("31 Days");
        }
        else if (month == 8) {
            System.out.println("31 Days");
        }
        else if (month == 9) {
            System.out.println("30Days");
        }
        else if (month == 10) {
            System.out.println("31Days");
        }
        else if (month == 11) {
            System.out.println("30 Days");
        }
        else if (month == 12) {
            System.out.println("31 Days");
        }
        else{
            System.out.println("inVailed Months No");
        }

    }
}
