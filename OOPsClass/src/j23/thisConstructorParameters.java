package j23;

import java.util.Scanner;

class thisKeywords {
    String name;
    int age;

    //when class name or parameter name are same then we use (this) keywords
    thisKeywords(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void entry() {

    }

    void display() {
        System.out.println("Name " + name);
        System.out.println("Id " + age);
    }
}

public class thisConstructorParameters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = input.nextLine();
        System.out.println("Enter Id");
        int age = input.nextInt();

        thisKeywords tk = new thisKeywords(name,age);

        tk.display();


    }
}
