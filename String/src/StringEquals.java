public class StringEquals {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        //address com

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);


        //Equal data chacking
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
    }
}
