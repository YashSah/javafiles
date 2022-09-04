package Arrays;

import java.util.*;

public class Array1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("enter the marks:");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("the input marks are:");
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);
        }
    }
}