package bitMasking;

import java.util.Scanner;

public class clearBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.:");
        int x = sc.nextInt();
        System.out.println("which index bit you want to clear");
        int idx = sc.nextInt();
        int temp = 1 << idx;
        int mask = ~(temp);
        int y = (x & mask);
        System.out.println("bit after clear:" + y);
    }
}