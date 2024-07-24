//Java Program to create and call a default constructor
import java.util.Scanner;
class Bike1{
    //creating a default constructor
    int gear;
    String c;
    Bike1(){
        System.out.println("Bike is created");
    }

    //main method
    public static void main(String args[]){
//calling a default constructor
        Scanner input = new Scanner(System.in);
        Bike1 b = new Bike1();

        b.gear = 5;
        b.c = "Red";

        System.out.println(b.gear);
        System.out.println(b.c);

    }
}