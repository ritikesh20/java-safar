public class freqCount {
    public static void main(String[] args) {

        String name = "Ritikeh";

        int [] freq = new int[128];

        for(int i = 0; i<name.length(); i++){
            char ch = name.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i<freq.length; i++){
            if(freq[i] > 0){
                System.out.println((char) i+ "->" + freq[i]);
            }
        }

    }
}
