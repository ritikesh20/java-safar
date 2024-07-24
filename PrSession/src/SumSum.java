import java.util.Scanner;

public class SumSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no = 0;

        int sum = 0;

        do {
            System.out.println("Enter no :");
            no = input.nextInt();

            if(no>0){
                sum = sum + no;

            }
            if(no <=0){
                System.out.println(sum);
            }

        }while (no >0);
        //   System.out.println(sum);
    }
}
