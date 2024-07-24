import java.util.Scanner;
class bankdetails {
    String userName;
    int password;
}
public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        bankdetails rbi = new bankdetails();

        System.out.println("UserName : ");
        rbi.userName = input.nextLine();

        System.out.println("PassWord : ");
        rbi.password = input.nextInt();
        
        System.out.println("UserName :" + rbi.userName);
        System.out.println("PassWord :" + rbi.password);
    }
}


