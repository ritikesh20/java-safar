import java.util.Scanner;

public class CToF {
    public static void main(String[] args) {
        // Celsius to Fahrenheit
        Scanner input = new Scanner(System.in);

        int celsius = 0;
        double fahrenheit =0;
        System.out.println("Enter Celsius");
        celsius = input.nextInt();

        fahrenheit = (celsius * 1.8) + 32;
        System.out.println(fahrenheit);
    }
}
