package Recursion;

//print the powerset of a given string

public class powerSet {
    static void power(String str, int i, String curr) {
        if (i == str.length()) {
            System.out.println(curr);
            return;
        }
        power(str, i + 1, curr + str.charAt(i));
        power(str, i + 1, curr);
    }

    public static void main(String args[]) {
        String s = "abc";
        int i = 0;
        String cur = "";
        power(s, i, cur);
    }
}
