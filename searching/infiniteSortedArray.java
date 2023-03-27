package searching;

//find the element in an infinite sorted array
//if we start finding element with linear search then it will have O(n) complexity, we have to optimise it in log(n).

public class infiniteSortedArray {
    void searchInfinite(int a[], int key) {
        int low = 0;
        int high = 1;
        while (a[high] < key) {
            low = high;
            high = 2 * high; // exponential growth
        }
        // binarySearch(a, key, low, high);
        System.out.println(binarySearch(a, key, low, high));
    }

    // for sorted array
    static int binarySearch(int a[], int key, int low, int high) {
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

    public static void main(String args[]) {
        infiniteSortedArray sc = new infiniteSortedArray();
        int a[] = { 1, 3, 7, 8, 12, 58, 72, 84, 89, 94, 99, 100, 155, 179, 200, 215, 245, 260, 297 };

        sc.searchInfinite(a, 179);
    }
}
