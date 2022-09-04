package Recursion;

import java.util.HashSet;

//very important
public class uniqueSubsequences {
    public static void uniqueSequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currchar = str.charAt(idx);

        uniqueSequences(str, idx + 1, newString + currchar, set);
        // or not to be
        uniqueSequences(str, idx + 1, newString, set);
    }

    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSequences(str, 0, "", set);
    }
}
