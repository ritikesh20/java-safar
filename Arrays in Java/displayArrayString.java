import java.util.Scanner;

public class displayArrayString{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int size = 0, i = 0;

        String [] menu = new String[5];

        System.out.print("Enter Items :");
        for(i = 0; i<5; i++){
            menu[i] = input.nextLine();
        }

        System.out.print("Display menu");
        for(i = 0; i<5; i++){
            System.out.println("Menu :" + menu[i]);
        }


    }
}