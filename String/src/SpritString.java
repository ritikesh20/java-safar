public class SpritString {
    public static void main(String[] args) {


        String name = "hello bhai kese ho";

        String[] arr = name.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String words = arr[i];
            String ans = Character.toString(words.charAt(0)) + words.substring(1);

            System.out.println(ans);
        }
    }
}

