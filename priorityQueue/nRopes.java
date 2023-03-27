package priorityQueue;

import java.util.PriorityQueue;

//connect N ropes with minimum cost
public class nRopes {
    static int minCost(int a[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < a.length; i++) {
            pq.add(a[i]);
        }
        int ans = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            ans += sum;
            pq.add(sum);
        }
        return ans;
    }

    public static void main(String args[]) {
        int a[] = { 2, 5, 4, 8, 6, 9 };
        int answ = minCost(a);
        System.out.println(answ);
    }
}
