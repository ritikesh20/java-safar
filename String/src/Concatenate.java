
public class Concatenate {
    public static void main(String[] args) {

        String name = "Hello ";
        String name2 = "World";
        System.out.println("Add Two or more string");
        String ans = name.concat(name2);

        System.out.println(ans);

        // Check THe String is contain the given words or Not

        String s1 = "Are You zod or Not";
        String s2 = "zod";

        boolean ans1 = false;
        if (s1.contains(s2)) {
            ans1 = true;
        }
        System.out.println(ans1);

        System.out.println("Compare a given string to the specified string buffer");
        String words = "Hello";
        String words2 = "hello";

        StringBuffer sb = new StringBuffer(words);

        System.out.println(words.contains(words));
        System.out.println(words.contains(words2));

        System.out.println("Check Ends With");
        String endWith = "Hello Chacha kese Ho";
        String end = "Hoo";

        if (endWith.endsWith(end)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
