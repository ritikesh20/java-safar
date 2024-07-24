public class MaxSubArray {
    public static void main(String [] args){

        int [] arr = {1,2,3,4,5,6};
        int i = 0;
        int j = 0;
        int k = 0;

       int maxSum = Integer.MIN_VALUE;

        for (i = 0; i<arr.length; i++){
            int start = i;
            for (j = i; j<arr.length; j++){
                int end = j;
                int currentSum = 0;
                for(k = start; k<=end; k++){
                    currentSum = currentSum + arr[k];
                }
                System.out.println(currentSum + " ");
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
                if(currentSum == 10){
                    System.out.println();
                }
            }
        }
        //System.out.println();
        System.out.println("Max Sum : " + maxSum);
    }
}
