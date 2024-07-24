public class New19 {
    public static void main(String[] args) {
        String word = "whzwhereabouts";

        String ans = "";

        boolean flag;

        if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u') {
            flag = false;
        }
        else
            flag = true;


        for (char ch : word.toCharArray()) {
            if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') && flag == false) {
                ans += 'V';
                flag = true;
            } else if (flag == true) {
                ans += 'C';
                flag = false;
            }
        }

        System.out.println(ans);
    }
}