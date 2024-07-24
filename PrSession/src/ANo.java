public class ANo {
    public static void main(String[] args) {
        int no = 18;
        int orgNo = no;
        int sum = 0;
        int i = 0;

        for (i = 1; i<no/2; i++){
            if(no % i == 0){
                sum = sum + i;
                //System.out.println(i);
            }
        }
        if(sum > orgNo ){
            System.out.println("Abundant NO");
        }
        else {
            System.out.println("Not A Abundant No");
        }

    }
}
