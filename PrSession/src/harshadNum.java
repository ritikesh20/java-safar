public class harshadNum {
    public static void main(String[] args) {
        int no = 157;
        int orgNo = no;
        int sum = 0;

        for (;no>0 ;){
            int x = no % 10;
            sum = sum + x;
            no = no / 10;
        }
        System.out.println(sum);
        if (orgNo % sum == 0){
            System.out.println("Harshad No :");
        }
        else {
            System.out.print("Not A Harshad No");
        }
    }
}
