package BitsManipulation;

import java.util.Scanner;

public class trailingZero {
    static void find(int num) {
        int res = 0;
        for (int i = 5; i <= num; i = i * 5) {
            res = res + num / i;
        }
        System.out.println(res);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. to find trailing zeroes in factorial:");
        int num = sc.nextInt();
        find(num);
    }
}
