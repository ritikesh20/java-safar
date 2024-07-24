public class freqStringCounting {
    public static void main(String[] args) {

//        String s = "Ritikesh";
//        int [] freq = new int[26];
//
//        for(int i = 0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            int index = ch - 97;
//
//            freq[index] = freq[index] + 1;
//        }
//        for(int i = 0; i<freq.length; i++){
//            if(freq[i] > 0){
//                System.out.println((char) (i + 97) + "->" + freq[i]);
//            }
//        }
        System.out.println("Hello");

        int[] arr = {1, 2, 2, 3, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            } else {
                sum = sum + arr[i];
                System.out.println("Sum" + sum);
            }
        }
        System.out.println(sum + arr[arr.length - 1]);


    }
}
