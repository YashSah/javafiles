package BitsManipulation;

import java.util.Scanner;

public class swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two no.'s:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("before swapping:x=" + x + " y=" + y);
        // swapping using xor without using third variable
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("after swapping:x=" + x + " y=" + y);
    }
}
