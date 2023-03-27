package stack;

import java.util.Stack;

public class nextSmaller {
    static void nextSmallerElement(int a[]) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s1 = new Stack<>();
        for (int i = a.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() >= a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                s1.push(-1);
            } else {
                s1.push(s.peek());
            }
            s.push(a[i]);
        }
        while (!s1.isEmpty()) {
            System.out.print(s1.peek() + " ");
            s1.pop();
        }
    }

    public static void main(String[] args) {
        int a[] = { 3, 10, 5, 1, 15, 10, 7, 6 };
        nextSmallerElement(a);
    }
}
