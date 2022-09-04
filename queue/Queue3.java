package queue;

//using java collection framework
import java.util.*;

public class Queue3 {
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>(); // here we can't write "new Queue" cause queue is an interface and
                                               // objects can only be created for classes, and queue can be implemented
                                               // using "LinkedList" class as well as using "ArrayDeque"
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
