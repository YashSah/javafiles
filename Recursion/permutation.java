package Recursion;

//program to print permutation of a string
public class permutation {
    static void printPermutn(String str, String ans) {
        // if string is empty
        if (str.length() == 0) {
            System.out.println(ans + "");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // rest of the string excludig the ith char
            String ros = str.substring(0, i) + str.substring(i + 1);

            printPermutn(ros, ans + ch);
        }
    }

    public static void main(String args[]) {
        String s = "abb";
        printPermutn(s, "");
    }
}