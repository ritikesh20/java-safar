public class withStr {
    public static void main(String[] args) {
        String s = "ab#c";

        String name = "";
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                continue;
            }
            else {
                name = name + ch;
            }
        }
        System.out.println(name);
    }
}
