public class PalindromFun {

    public static boolean isPalindrom(String name) {
        int n = name.length();
        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String name = "moom";

        System.out.println(isPalindrom(name));

    }
}
