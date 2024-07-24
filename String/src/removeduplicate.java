public class removeduplicate {
    public static void main(String[] args) {

        String name = "hellol";

        char [] ch = name.toCharArray();

        String ans = "";

        for (char value : ch){
            if(ans.indexOf(value) == -1){
                ans = ans + value;
            }
        }
        System.out.println(ans);
    }
}
