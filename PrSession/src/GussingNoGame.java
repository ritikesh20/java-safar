import java.util.Random;
import java.util.Scanner;

public class GussingNoGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no = 0;
        int ComputerGno = (int) (1 + (100* Math.random()));
        System.out.println(ComputerGno);

        int squareRoot = (int) Math.sqrt(ComputerGno);
        System.out.println(squareRoot);





//        do {
//            System.out.println("Bot :"+ComputerGno);
//            System.out.println(  "Guss The No");
//            no = input.nextInt();
//
//            if(no>ComputerGno){
//                System.out.println("You :" +"No Bra hai");
//            }
//            else {
//                System.out.println("You :" + "no Chhota hai");
//            }
//
//        }while (ComputerGno != no);


    }
}
