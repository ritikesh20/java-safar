public class TestQ2 {
    public static String replaceCharacter(String str, int n, char ch1, char ch2){
        String ansStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ch1) {
                ch = ch2;
                ansStr = ansStr + ch;
            }
            else if (ch == ch2) {
                ch = ch1;
                ansStr = ansStr + ch;
            } else {
                ansStr = ansStr + ch;
            }
        }
        return ansStr;
    }
    public static void main(String[] args) {

        String str = "bluecoloure";
        char ch1 = 'l';
        char ch2 = 'o';
        int n = str.length();
        String ans = replaceCharacter(str,n,ch1,ch2);
        System.out.println(ans);


    }
}
