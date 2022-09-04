package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String args[]) {
        // creating
        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // size
        System.out.println("size of the set is:" + set.size());

        // search
        if (set.contains(1)) {
            System.out.println("set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("does not contain 6");
        }
        // delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("does not contain 1");
        }

        // print all elements
        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();

        // hasNext
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
