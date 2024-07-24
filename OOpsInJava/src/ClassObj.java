import java.util.Scanner;

public class ClassObj {
    public static class me{
        String name;
        int roll;
        double cgpa;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        me My = new me();

        System.out.println("Name :");
        My.name = input.nextLine();


        System.out.println("Roll");
        My.roll = input.nextInt();

        System.out.println("Cgpa ");
        My.cgpa = input.nextDouble();

        System.out.println(My.name);
        System.out.println(My.roll);
        System.out.println(My.cgpa);
    }
}
