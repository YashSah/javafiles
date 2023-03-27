package hashset;

//union of two unsorted array and return the size
import java.util.HashSet;

public class unionArray {
    static int union(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        return set.size();
    }

    public static void main(String args[]) {
        int[] a1 = { 5, 10, 15, 5 };
        int[] a2 = { 10, 15, 4 };
        int ans = union(a1, a2);
        System.out.println(ans);
    }
}
