package BitsManipulation;

import java.util.Scanner;

public class palindromeNum {
    static int palindrome(int num) {
        int sum = 0, rem;
        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. to find if it is palindrome or not:");
        int num = sc.nextInt();
        int ans = palindrome(num);
        if (ans == num) {
            System.out.println("palindrome no.");
        } else {
            System.out.println("not palindrome no.");
        }
    }
}
