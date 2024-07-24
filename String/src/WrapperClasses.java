import java.util.Scanner;

public class WrapperClasses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        String arr = "Rj1+";
//
//        char[] ch = arr.toCharArray();
//        boolean ans = false;
//
//        for (int i = 0; i < ch.length; i++) {
//            if ((ch[i] >= 'a' && ch[i] <= 'z') && (ch[i] >= 'A' && ch[i] <= 'Z') && (ch[i] >= '!' && ch[i] <= '9')) {
//                ans = true;
//                break;
//            }
//        }
//        System.out.println(ans);
        Integer a = Integer.valueOf(123);
        System.out.println(a);

        Integer x = 55;
        System.out.println(x);

        Integer s = Integer.valueOf("123");
        System.out.println(s + 5);
        System.out.println(s);

        //
        //  Byte b = 14;
        //Conver stirng in string

        String name = "123";
        int in = Integer.valueOf(name);

        in = Integer.parseInt(name);
        System.out.println(in);

        String b = "true";
        boolean boo = Boolean.valueOf(b);
        boo = Boolean.parseBoolean(b);
        System.out.println(boo);

        // Bufferd Reader



    }
}





