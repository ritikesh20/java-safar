package Recursion_Level_1;

public class fabonacciNo {
    public static int fab(int no) {

        if (no == 0 || no == 1) {
            return no;
        }
        int x = fab(no - 1) + fab(no - 2);
        // System.out.println(x);
        return x;
    }

    public static void main(String[] args) {

        int no = 5;

        int ans = fab(no);
        for (int i = 0; i < no; i++) {
            System.out.println(ans);
        }
        System.out.println(ans);
    }
}
