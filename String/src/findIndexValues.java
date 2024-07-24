import java.util.Scanner;

public class findIndexValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "Ritikesh Singh";

        System.out.println("Enter Your Finding Key words");
        int x = input.nextInt();



        if(x > name.length()){
            System.out.println("Aukad ke andar entry kr bsk ke");
        }
        else {
            char index = name.charAt(x);
            System.out.println(index);
        }
    }
}
