package Sorting;

import java.util.*;

public class insertionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // complexity=O(n^2)
    public static void main(String args[]) {
        int array[] = { 7, 8, 3, 1, 2 };
        // insertion sort
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        printArray(array);
    }
}
