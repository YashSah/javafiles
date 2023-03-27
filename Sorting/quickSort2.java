package Sorting;

import java.util.*;

public class quickSort2 {
    static void quickSort(int arr[], int start, int end) {
        // base case
        if (start >= end) {
            return;
        }
        // partition
        int p = partition(arr, start, end);

        // left part sort
        quickSort(arr, start, p - 1);

        // right part sort
        quickSort(arr, p + 1, end);
    }

    static int partition(int arr[], int start, int end) {
        int pivot = arr[start];
        int cnt = 0;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivot) {
                cnt++;
            }
        }
        int pivotIndex = start + cnt;
        swap(arr[pivotIndex], arr[start]);

        int i = start, j = end;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            // otherwise swap
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr[i++], arr[j--]);
            }
        }
        return j;
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return;
    }

    public static void main(String arggs[]) {
        int arr[] = { 2, 4, 1, 6, 9 };
        int size = arr.length;
        quickSort(arr, 0, size - 1);
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
