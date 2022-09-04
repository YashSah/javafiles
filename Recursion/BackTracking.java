package Recursion;

public class BackTracking {
    public static void printPermutation(String str, String perm, int idx) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, perm + currchar, idx + 1);
        }
    }

    public static void main(String args[]) {
        String str = "ABC";
        printPermutation(str, "", 0);
    }
}
