import java.util.Stack;

public class BracketGame {
    public static void main(String[] args) {

        String s = "()(()){}[]";
        int n = s.length();
        System.out.println("Size :" + s);

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                stack.pop();
            }
        }
        System.out.println(stack);

    }
}
