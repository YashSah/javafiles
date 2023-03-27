package important;

public class booksAllocation {
    int minPages(int a[], int k) {
        int min = maxOf(a);
        int max = sumOf(a);
        int res = 0;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (isFeasible(a, k, mid)) {
                res = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return res;
    }

    static int maxOf(int a[]) {
        int n = a.length;
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    static int sumOf(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    boolean isFeasible(int a[], int k, int res) {
        int student = 1, sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (sum + a[i] > res) {
                student++;
                sum = a[i];
            } else {
                sum += a[i];
            }
        }
        return student <= k;
    }

    public static void main(String args[]) {
        booksAllocation ba = new booksAllocation();
        int a[] = { 12, 34, 67, 90 };
        int ans = ba.minPages(a, 2);
        System.out.println(ans);
    }
}
