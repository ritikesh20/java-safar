package j23;

import java.util.Scanner;

public class cabService {
    String car_types;
    String sp;
    String ep;
    double km;
    double bill;

    cabService() {
        this.car_types = "";
        this.sp = " ";
        this.ep = " ";
        this.km = 0.0;
        this.bill = 0.0;
    }

//    void StartingPoints() {
//        Scanner input = new Scanner(System.in);
//        String StartingPoints;
//
//        System.out.println("Enter Starting Points");
//        StartingPoints = input.nextLine();
//        System.out.println(StartingPoints);
//
//        String endPoints;
//        System.out.println("Ending Points");
//        endPoints = input.nextLine();
//        System.out.println(endPoints);
//
//        if (StartingPoints.equals("bhopal") && endPoints.equals("bihar")){
//            System.out.println("$100");
//        }
//    }

    void accept() {
        Scanner input = new Scanner(System.in);

        System.out.println("Sp Points");
        sp = input.nextLine();

        System.out.println("Enter Ending Points :");
        ep = input.nextLine();

        System.out.println("Enter Car Types :");
        car_types = input.nextLine();

        System.out.println("Enter Km :");
        km = input.nextInt();

    }

    void cal() {
        if (car_types.equals("Ac") && sp.equals("bihar") && ep.equals("bhopal")) {
            if (km <= 5) {
                bill = 150;
            } else {
                bill = 150 + (km - 5) * 10;
            }
        } else {
            if (km <= 5) {
                bill = 120;
            } else {
                bill = 120 + (km - 5) * 8;
            }
        }
    }

    void display() {
        System.out.println("Car Type :" + car_types);
        System.out.println("km :" + km);
        System.out.println("Bill :" + bill);
    }

    public static void main(String[] args) {
        cabService cab = new cabService();
        System.out.println("Welcome To Apna Safar\n*************");
        //cab.StartingPoints();
        cab.accept();
        cab.cal();
        cab.display();
    }
}
