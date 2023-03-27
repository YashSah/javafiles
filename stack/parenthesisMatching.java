package stack;

import java.util.Stack;

public class parenthesisMatching {
    static void isparenthesisMatching(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (cur == '(' || cur == '[' || cur == '{') {
                s.push(cur);
            } else {
                char top = s.peek();
                if (top == '(' && cur == ')' || top == '{' && cur == '}' || top == '[' && cur == ']') {
                    s.pop();
                }
            }
        }
        if (s.isEmpty()) {
            System.out.println("matching parenthesis");
        } else {
            System.out.println("not matching parenthesis");
        }
    }

    public static void main(String[] args) {
        String str = "((({})))";
        isparenthesisMatching(str);
    }
}
