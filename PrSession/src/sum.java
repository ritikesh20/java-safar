import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no = 0;
        int evenSum = 0;
        int oddS = 0;
        int negSum = 0;

        do {
            System.out.println("Enter No");
            no = input.nextInt();

            if (no % 2 == 0) {
                evenSum = evenSum + no;

            } else if (no < 0) {

                negSum += negSum;


            } else {
                oddS = oddS + no;

            }

        } while (no != 0);
        System.out.println(evenSum);
        System.out.println(negSum);
        System.out.println(oddS);
    }
}
