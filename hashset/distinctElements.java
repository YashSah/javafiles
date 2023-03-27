package hashset;

import java.util.HashSet;

public class distinctElements {
    static int countdistinct(int a[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        return set.size();
    }

    public static void main(String args[]) {
        int a[] = { 5, 10, 15, 5, 4, 5 };
        int ans = countdistinct(a);
        System.out.println(ans);
    }
}
