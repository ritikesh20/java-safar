import java.util.Scanner;
class bankdetail {
    private String userName;
    private int password;

    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }

    public void setPassword(int password){
        this.password = password;
    }
    public int getPassword(){
        return password;
    }
    public void display(){
        System.out.println("Thank You For LogIn :");
    }

}
public class GetSetBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        bankdetail rbi = new bankdetail();
        String name;
        int pw = 0;


       System.out.println("Enter UserName :");
//        rbi.setUserName( name = input.nextLine());
        name = input.nextLine();
        rbi.setUserName(name);
//Both way is working
        System.out.println("Enter Password");
        rbi.setPassword(pw = input.nextInt());

        System.out.println("UserName : " + rbi.getUserName());
        System.out.println("PassWord : " + rbi.getPassword());

        rbi.display();



    }
}


