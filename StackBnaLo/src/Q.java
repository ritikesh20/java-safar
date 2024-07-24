import java.util.Stack;

public class Q {
    public static void main(String[] args) {

        String s = "leet**cod*e";

        StringBuilder ans = new StringBuilder();

        Stack<Character> q = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '*'){
                if(q.size() == 0){
                    continue;
                }
                else {
                    q.pop();
                }
            }
            else {
                q.push(ch);
            }
        }

        System.out.println(q);
        System.out.println(q.size());

        while(!q.isEmpty()){
            ans.append(q.pop());
        }
        System.out.println(ans.reverse());
    }
}
