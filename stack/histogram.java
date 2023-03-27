package stack;

import java.util.Stack;

class histogram {
    static public int largestRectangleArea(int[] h) {
        // check null condition
        if (h == null || h.length == 0) {
            return 0;
        }
        // Initialize variables left and right
        int n = h.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int ht = (i == n) ? 0 : h[i];

            // if stack is empty or ht>=h[top] push in stack
            // else process the elements and find area.

            if (stack.isEmpty() || ht >= h[stack.peek()]) {
                stack.push(i);
            } else {
                // process elements and find the maxArea for popped index
                int top = stack.pop();
                int width = (stack.isEmpty()) ? i : i - stack.peek() - 1;
                int area = h[top] * width;
                maxArea = Math.max(maxArea, area);
                i--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int h[] = { 2, 1, 5, 6, 2, 3 };
        int ans = largestRectangleArea(h);
        System.out.println(ans);
    }
}