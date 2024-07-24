public class StringFreqcount {
    public static void main(String[] args) {

        String s = "hello";


        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '1') {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {

                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = '1';
                    }
                }
                System.out.println("Frq of " + arr[i] + " :" + count);
            }
        }
    }
}
