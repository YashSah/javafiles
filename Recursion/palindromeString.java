package Recursion;

import java.util.*;

public class palindromeString {
    static boolean isPalin(String str, int l, int r) {
        // if only one character
        if (l == r) {
            return true;
        }
        if (str.charAt(l) != str.charAt(r)) {
            return false;
        }
        return isPalin(str, l + 1, r - 1);
    }

    public static void main(String artgs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string to check if it is palindrome or not:");
        String str = sc.next();
        boolean ans = isPalin(str, 0, str.length() - 1);
        if (ans == true) {
            System.out.println("palindrome string");
        } else if (ans != true) {
            System.out.println("not palindrome string");
        }
    }
}