package Functions;

import java.util.*;

public class Functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name to be printed:");
        String name = sc.nextLine();
        printMyName(name);
    }
}