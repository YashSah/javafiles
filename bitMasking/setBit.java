package bitMasking;

import java.util.Scanner;

public class setBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.:");
        int x = sc.nextInt();
        System.out.println("which index bit you want to set");
        int idx = sc.nextInt();
        int map = 1 << idx;
        int y = (x | map);
        System.out.println("bit after set:" + y);
    }
}