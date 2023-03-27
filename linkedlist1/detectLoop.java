package linkedlist1;

//Q> to find if a loop is present in the linked list
public class detectLoop {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }

    // // method to find from which node the cycle is actually starting
    // static Node detectFirstNode(Node head) {
    // Node meet = detectCycle(head);
    // Node start = head;

    // while (start != meet) //
    // {
    // start = start.next;
    // meet = meet.next;
    // }
    // return start;
    // }

    public static void main(String args[]) {
        Node head = new Node(20);
        head.next = new Node(4);
        head.next.next = new Node(15);
        head.next.next.next = new Node(10);

        head.next.next.next.next = head.next.next;// create loop for testing

        Node res = detectCycle(head);
        // Node ans = detectFirstNode(head);
        if (res == null) {
            System.out.println("loop doesn't exist");
        } else {
            System.out.println("loop starting node is:" + res.data);
        }
    }
}
