import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char gender;
        System.out.println("Gender :");
        gender = input.next().charAt(0);

        int s_year = 0;
        System.out.println("Enter Year :");
        s_year = input.nextInt();

        input.nextLine();
        String qualification;
        System.out.println("Qualification");
        qualification = input.nextLine();

        if((gender == 'M' && qualification.equals("P_g")  ) && s_year>10){
            System.out.println("15k");
        }
       else if((gender == 'M' && qualification.equals("g")  ) && s_year>=10){
            System.out.println("10k");
        }
        else if((gender == 'M' && qualification.equals("P_g")  ) && s_year<10){
            System.out.println("10k");
        }
        else if((gender == 'M' && qualification.equals("g")  ) && s_year<10){
            System.out.println("7k");
        }
        else if((gender == 'F' && qualification.equals("P_g")  ) && s_year>10){
            System.out.println("12k");
        }
        else if((gender == 'F' && qualification.equals("g")  ) && s_year>=10){
            System.out.println("9k");
        }
        else if((gender == 'F' && qualification.equals("P_g")  ) && s_year<10){
            System.out.println("10k");
        }
        else if((gender == 'F' && qualification.equals("g")  ) && s_year<10){
            System.out.println("6k");
        }
        else {
            System.out.println("invaild");
        }
    }
}
