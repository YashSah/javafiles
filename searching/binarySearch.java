package searching;

public class binarySearch {
    int search(int a[], int key) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;// if element is not present
    }

    void mergeSort(int a[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
        return;
    }

    void merge(int a[], int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        for (i = 0; i < n1; i++) {
            leftArray[i] = a[beg + i];
        }
        for (j = 0; j < n2; j++) {
            rightArray[j] = a[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = beg;

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

    void printArray(int a[], int n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String args[]) {
        int a[] = { 3, 11, 10, -4, -1, 7, 2 };
        int n = a.length;
        binarySearch bs = new binarySearch();
        bs.mergeSort(a, 0, n);
        bs.search(a, -1);
    }
}
