public class PalindromNo {
    public static void main(String[] args) {
        int no = 121;
        int ogNo = no;
        int rem = 0;

        while (no>0){
            int x = no % 10;
            rem = (rem * 10) + x;
            no = no / 10;
        }
        if(ogNo == rem){
            System.out.println("P No");
        }
        else {
            System.out.println("not a P no");
        }
    }
}
