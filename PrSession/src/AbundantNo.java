public class AbundantNo {
    public static void main(String[] args) {
        int no = 12;
        int orgNo = no;
        int sum = 0;

        for (int i= 1; i<=no/2; i++){
            if(no % i == 0){
                sum += i;
            }
        }
        System.out.println(sum);
        if (sum>orgNo){
            System.out.println("Abubdant No");
        }
        else {
            System.out.println("Not A abundantNo :");
        }
    }
}
