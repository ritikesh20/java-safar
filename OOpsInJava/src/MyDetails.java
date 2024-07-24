import java.util.Scanner;
class Myid{
    String name;
    int age;

    public void diplay(){

        System.out.println(this.name);
        System.out.println(this.age);

    }
}
public class MyDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Myid id = new Myid();

        id.name = "Ritikesh ";
        id.age = 12;
        id.diplay();

        System.out.println("Name :");
        id.name = input.nextLine();

    }
}