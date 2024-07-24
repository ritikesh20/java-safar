package j23;

import java.util.Scanner;

public class RailTicket {
    String name;

    long mobileNo;
    int price;
    String ticket_Types;

    RailTicket(){
        this.name = "";
        this.mobileNo = 0;
        this.price = 0;
        this.ticket_Types = "";

    }

    void Entry(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Name");
        name = input.nextLine();

        //System.out.println("Entry Mobile");
        mobileNo = 98212041;

        System.out.println("Enter Ticket Type");
        ticket_Types = input.nextLine();

    }

    void cal(){
        int ac = 1300;
        int non_Ac = 700;
        int sleeper = 500;
        int General = 300;
        if(ticket_Types.equals("Ac")){
            price = ac;
        }
        else if (ticket_Types.equals("Non Ac")){
            price = non_Ac;
        }
        else if(ticket_Types.equals("Sleeper")){
            price = sleeper;
        }
        else {
            price = General;
        }
    }

    void display(){
        System.out.println("Name :" + name);
        System.out.println("Mobile :" + mobileNo);
        System.out.println("Price :" + price);
    }
    public static void main(String[] args) {
        RailTicket RT = new RailTicket();
        RT.Entry();
        RT.cal();
        RT.display();
    }
}
