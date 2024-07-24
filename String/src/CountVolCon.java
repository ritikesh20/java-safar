public class CountVolCon {
    public static void main(String[] args) {

        String name = "Ritikesh";

        int con = 0;
        int vol = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vol++;
            } else {
                con++;
            }
        }
        System.out.println("Vol :" + vol);
        System.out.println("Con :" + con);
        System.out.println(name.length());


    }
}
