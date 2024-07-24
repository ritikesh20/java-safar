public class countLeg {
    public static void main(String[] args) {

        String name = "Ritikesh";

        char [] ch = name.toCharArray();

        int start = 0;
        int end = ch.length;
        int count = 0;

        while (start != end){
            count++;
            start++;
        }

        System.out.println(count);
    }
}
