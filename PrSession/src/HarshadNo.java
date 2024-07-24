import java.util.Scanner;

public class HarshadNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no = 0;
        System.out.println("Enter No :");
        no = input.nextInt();
       // int no = 156;//12
                // no divied by its sum
        int sum = 0;
        int newNo = no;

        while (no>0){
            int x = no% 10;

            sum = sum + x;

            no = no / 10;
        }
        System.out.println(sum);
        if(newNo % sum == 0){
            System.out.println("hNo");
        }
        else {
            System.out.println("invaild  No :");
        }
    }
}
