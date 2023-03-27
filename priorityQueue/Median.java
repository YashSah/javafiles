package priorityQueue;

//find median of running stream of integers
import java.util.*;

public class Median {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public void insertNum(int num) {
        if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }

        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;
        }
        return maxHeap.peek();
    }

    public static void main(String args[]) {
        Median obj = new Median();
        obj.insertNum(3);
        obj.insertNum(1);
        System.out.println("the median is: " + obj.findMedian());
        obj.insertNum(5);
        System.out.println("the median is: " + obj.findMedian());
        obj.insertNum(4);
        System.out.println("the median is: " + obj.findMedian());
    }
}
