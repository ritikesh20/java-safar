import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double rating = 0;
        System.out.println("Rating");
        rating = input.nextDouble();
        String movieName ;
        input.nextLine();
        System.out.println("Movies Name :");
        movieName = input.nextLine();

        if(rating>=0.0 && rating <=2.0){
            System.out.println("flop");
        }
        else if (rating>=2.1 && rating <=3.4) {
            System.out.println("Semi - hit");
        }
        else if (rating>=3.5 && rating <=4.5) {
            System.out.println("Hit");
        }
        else if (rating>=4.6 && rating <=5.0) {
            System.out.println("Super-Hit");
        }
        else {
            System.out.println("InVaild");
        }
    }
}