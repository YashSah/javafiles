package Sorting;

public class mergeSorting {
    void merge(int a[], int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        // temporary arrays
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        // copy data to temporary arrays
        for (i = 0; i < n1; i++) {
            leftArray[i] = a[beg + i];
        }
        for (j = 0; j < n2; j++) {
            rightArray[j] = a[mid + 1 + j];
        }

        // initial index of left and right arrays
        i = 0;
        j = 0;
        k = beg;// initial index of merged sub array

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                a[k] = leftArray[i];
                i++;
            } else {
                a[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = rightArray[j];
            j++;
            k++;
        }
    }

    void mergeSort(int a[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    void printArray(int a[], int n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String args[]) {
        int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };
        int n = a.length;
        mergeSorting m1 = new mergeSorting();
        System.out.println("before sorting array elements are:");
        m1.printArray(a, n);
        m1.mergeSort(a, 0, n - 1);
        System.out.println("\nafter sorting array elements are:");
        m1.printArray(a, n);
        System.out.println();
    }
}