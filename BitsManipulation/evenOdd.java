package BitsManipulation;

import java.util.Scanner;

//bit manipulation programs are faster 
public class evenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int x = sc.nextInt();
        if ((x & 1) == 0) {
            System.out.println("even no.");
        } else if ((x & 1) == 1) {
            System.out.println("odd no.");
        }
    }
}