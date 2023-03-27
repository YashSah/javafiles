package priorityQueue;

import java.util.*;

public class priorityQueue {
    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // default minheap, can be made maxheap by writing:
                                                           // "PriorityQueue<Integer> pq=new //
                                                           // PriorityQueue<>(Collections.reverseOrder())"
        pq.add(5);
        pq.add(15);
        pq.add(10);
        System.out.println(pq.size());
        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); // peek gives the top element
            pq.poll(); // poll deletes the top element
        }
    }
}
