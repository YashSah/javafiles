package hashset;

//we have to return the count of the itersection array 
import java.util.HashSet;

public class intersectionArrrays {
    static int intersect(int a[], int b[]) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (set.contains(a[i])) {
                count++;
                set.remove(b[i]);
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int a[] = { 5, 10, 15, 5, 10 };
        int b[] = { 15, 10, 4 };
        int ans = intersect(a, b);
        System.out.println(ans);
    }
}
