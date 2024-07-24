public class Revfor {
    public static void main(String[] args) {

        int no = 155;
        int rem = 0;

        for (; no >0;  ){

            int x= no % 10;
            rem = (rem * 10) + x;
            no /= 10;
        }
        System.out.println(rem);
    }
}
