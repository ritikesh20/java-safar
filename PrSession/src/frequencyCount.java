public class frequencyCount {
    public static void main(String[] args) {

        int [] arr = {2,2,3,2,3,5,5,6,7,5,5,8,8};

        for (int i = 0; i<arr.length; i++){
            int current = arr[i];
            int count = 0;
            if(arr[i] == -1){
                continue;
            }
            for (int j = 0; j<arr.length; j++){
                if(arr[j] == current){
                    count++;
                    //arr[j] = -1
                    // repeated No  ko -1 me convert kr rha hai

                    arr[j] = -1;
                }
            }
            System.out.println(" Frequency Of " + current + " is " + count);
        }
    }
}
