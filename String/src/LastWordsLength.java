public class LastWordsLength {
    public static void main(String[] args) {

        String words = "hello bro kya hal chal haXxi   ";

        String name = words.trim();
        System.out.println(name);
        int count = 0;

        for (int i = name.length()-1; i>=0; i--){
            char ch = name.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                count++;
            }
            if(ch == ' '){
                break;
            }
        }
        System.out.println(count);

    }
}
