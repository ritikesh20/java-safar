public class FirstLastIntoUL {
    public static void main(String[] args) {
        String s = "Hello Bhai kese ho";
        String[] arr = s.split(" ");
        String temp = " ";

        for (int i = 0; i < arr.length; i++) {
            String words = arr[i];

            String ans = " ";

            if (words.length() <= 2) {
                ans = words.toUpperCase();
            } else {
                ans = Character.toUpperCase(words.charAt(0)) + words.substring(1, words.length() - 1) +
                        Character.toUpperCase(words.charAt(words.length()));
            }
            temp += ans + " ";
        }
        System.out.println(temp);
    }
}
