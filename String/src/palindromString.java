import java.util.Scanner;

public class palindromString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        char arr[] = s.toCharArray();

        boolean ans = true;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                ans = false;
            }
            start++;
            end--;
        }
        System.out.println(ans);

    }
}
