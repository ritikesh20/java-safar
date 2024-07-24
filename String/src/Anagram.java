public class Anagram {

    public static  boolean isAnagram(String a , String b){
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char ch : a.toCharArray()){
            freq1[ch - 97]++;
        }
        for (char ch : a.toCharArray()){
            freq2[ch - 97]++;
        }

        for (int i = 0; i<26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {


        System.out.println(isAnagram("state","taste"));


    }
}
