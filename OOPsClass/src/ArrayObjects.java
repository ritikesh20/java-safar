import java.util.Arrays;
import java.util.Scanner;

class students{
    String name;
    int age;
    char sec;

    students(String name,int age, char sec){
        this.name = name;
        this.age = age;
        this.sec = sec;
    }

    @Override
    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sec=" + sec +
                '}';
    }
}

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // normal arr // int [] arr = new int [size];
        // object arr // clasename(student) [] arrStudent = new students[2];
        students [] arrStudnet = new students[2];

        for (int i = 0; i<arrStudnet.length; i++){
            System.out.println("Enter Student Name : ");
            String name = input.nextLine();

            System.out.println("Enter Student Age :");
            int age = input.nextInt();
            input.nextLine();
            System.out.println("Enter Student Section");
            char sec = input.nextLine().charAt(0);

            arrStudnet[i] = new students(name,age,sec);
        }
        System.out.println(Arrays.toString(arrStudnet));

    }
}
