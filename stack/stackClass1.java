package stack;

import java.io.IOException;

//implementing stack data structure using arrays
public class stackClass1 {
    static int a[];
    int top;
    int capacity;

    public stackClass1(int capacity) {
        this.capacity = capacity;
        top = -1;
        a = new int[capacity];
    }

    void push(int data) throws IOException {
        if (top == capacity - 1) {
            throw new IOException("stack full error");
        }
        top++;
        a[top] = data;
    }

    int pop() throws Exception {
        if (top == -1) {
            throw new Exception("underflow stack");
        }
        int res = a[top];
        top--;
        return res;
    }

    int peek() throws Exception {
        if (top == -1) {
            throw new Exception("empty stack");
        }
        return a[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    public static void main(String args[]) throws Exception {
        stackClass1 s = new stackClass1(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();
        s.pop();
        int ans = s.peek();
        System.out.println(ans);
        s.pop();
        s.pop();
        int ans1 = s.peek();
        System.out.println(ans1);
        s.pop();
        boolean ans2 = s.isEmpty();
        System.out.println(ans2);
    }
}
