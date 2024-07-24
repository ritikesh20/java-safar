import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int Maths, Physics, Chemistry, English,Hindi,marks = 0;
        System.out.println("Maths");
        Maths = input.nextInt();
        System.out.println("Physics");
        Physics = input.nextInt();
        System.out.println("Chemistry");
        Chemistry = input.nextInt();
        System.out.println("English");
        English = input.nextInt();
        System.out.println("Hindi");
        Hindi = input.nextInt();

        marks =Maths+ Physics+ Chemistry + English +Hindi;
        double per = marks/5;

        if (per >= 90 && per <=100){
            System.out.println("Grade A");
        }
        else if (per >= 80 && per <=90){
            System.out.println("Grade B");
        }
        else if (per >= 70 && per <=80){
            System.out.println("Grade C");
        }
        else if (per >= 60 && per <=70){
            System.out.println("Grade D");
        }
        else if (per >= 40 && per <=60){
            System.out.println("Grade A");
        }
        else if (per <=40){
            System.out.println("Fail");
        }
        else {
            System.out.println("inVaild Marks");
        }




    }
}
