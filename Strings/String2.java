package Strings;

import java.util.*;

public class String2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // concatenation
        String firstName = "yash";
        String lastName = "sah";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
        // compare
        String name1 = "tony";
        String name2 = "Tony";
        // 1-> s1>s2: +value
        // 2-> s1=s2: 0
        // 3-> s1<s2: -ve value
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        // subString
        String sentence = "my name is yash";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
}