import java.util.Arrays;

public class hello {
    public static void main(String[] args) {

        String name = "mOoM";

        name = name.toLowerCase();

        char [] ch = name.toCharArray();

        System.out.println(Arrays.toString(ch));
        boolean ans = true;

        int start = 0;
        int end = ch.length-1;

        while (start <= end){
            if(ch[start] != ch[end]){
                ans = false;
            }
            start++;
            end--;
        }

        System.out.println(ans);
    }
}