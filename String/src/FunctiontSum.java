import java.util.Arrays;

public class FunctiontSum {
    public static int cal(int a, int b,int sum){
         sum = a + b;

        return sum;
    }
    public static void diplayName(String name){
        //System.out.println(name);

        String [] arr = name.split(" ");
        for (int i =0; i<arr.length; i++){
            String words = arr[i];
            String ans = Character.toString(words.charAt(0));
            System.out.print(ans);

        }

    }
    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int sum = 0;

        sum = cal(a,b,sum);
        System.out.println(sum);

        String name = "Hello Bhai kese ho";

        diplayName(name);
    }
}
