package j23;

import java.util.Scanner;

class hero {
    String name;
    int id;

    hero() {
        this.name = "";
        this.id = 0;
    }

    void entry() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name");
        name = input.nextLine();
        System.out.println("Enter Id");
        id = input.nextInt();
    }

    void display() {
        System.out.println("Name " + name);
        System.out.println("Id " + id);
    }
}

public class ClassUserInput {
    public static void main(String[] args) {
        hero Hero = new hero();

        Hero.entry();
        Hero.display();
    }
}
