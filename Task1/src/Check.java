import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char keyword ;
        System.out.println("keyWords");
        keyword = input.next().charAt(0);

        if(keyword >= 'A' && keyword <= 'Z' || keyword >= 'a' && keyword <= 'z'){
            System.out.println("Alphabets");
        }
        else if(keyword >= '0' && keyword <='9'){
            System.out.println("Digits");
        }
        else {
            System.out.println("Special Character");
        }

    }
}
