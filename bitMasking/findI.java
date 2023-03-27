package bitMasking;

import java.util.Scanner;

// program to find the ith bit 
public class findI {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.:");
        int x = sc.nextInt();
        System.out.println("which index bit you want to find:");
        int idx = sc.nextInt();
        int map = 1 << idx;
        if ((map & x) != 0) {
            System.out.println("bit is 1");
        } else {
            System.out.println("bit is 0");
        }
    }
}
