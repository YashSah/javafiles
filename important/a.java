package important;

import java.util.*;

class a {
    public String reverseWords(String s)
    {
        String ans="";
        Stack<Character> stack=new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            while(s.charAt(i)!=' ')
            {
                stack.push(s.charAt(i));
            }
            while(!stack.isEmpty())
            {
                stack.pop();
            }
        }
        return 
    }

    public static void main(String args[]) {
        a obj = new a();
        obj.reverseWords("my name is yash");
    }
}