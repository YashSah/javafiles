package BitsManipulation;

import java.util.*;

public class prop2 {
    static void findTwoNonRepeat(int arr[]) {
        int res = 0, i = 0;
        while (i < arr.length) {
            res = res ^ arr[i];
            i++;
        }
        int temp = res;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 4, 5, 3, 4, 2, 1, 3 };
        findTwoNonRepeat(arr);

    }
}
