package BitsManipulation;

//program to show every non-repeating element in an array where each element repeats twice using property of xor function
import java.util.Scanner;

public class prop1 {

    static void findNonRepeat(int arr[]) {
        int res = 0, i = 0;
        while (i < arr.length) {
            res = res ^ arr[i];
            i++;
        }
        System.out.println(res);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 4, 5, 3, 4, 1, 3 };
        findNonRepeat(arr);

    }
}
