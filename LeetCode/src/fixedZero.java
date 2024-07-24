public class fixedZero {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int count = 0;


        while (num1 >= 0) {
            if (num1 > num2) {
                num1 = num1 - num2;
                count++;

            }
            else if (num2 > num1) {
                num2 = num2 - num1;
                count++;
            }
            else if (num2 == num1) {
                num2 = num2 - num1;
                count++;
                break;
            }
        }
        System.out.println(count);
    }
}
