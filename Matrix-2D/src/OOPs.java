import java.util.Scanner;

class student{
    String name;
    int age;
    char sec;
    double cgpa;
    String college;
}


public class OOPs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        student stud = new student();

        System.out.println("Enter Name");
        stud.name = input.nextLine();

        System.out.println("Enter Age");
        stud.age = input.nextInt();

        System.out.println("Enter Sec");
        stud.sec = input.next().charAt(0);

        System.out.println("Enter Cgpa");
        stud.cgpa = input.nextDouble();

        input.nextLine();

        System.out.println("Enter College Name");
        stud.college = input.nextLine();

        System.out.println("Name"+ stud.name);
        System.out.println("Age"+ stud.age);
        System.out.println("Sec"+ stud.sec);
        System.out.println("CGPA"+ stud.cgpa);
        System.out.println("College Name"+ stud.college);
    }
}
