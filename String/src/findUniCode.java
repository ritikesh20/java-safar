import java.util.Scanner;

public class findUniCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "AaRitikesh";

        System.out.println("Enter Index");
        int index = input.nextInt();

        int uniCode = name.codePointAt(index);
        System.out.println(uniCode);

    }
}
