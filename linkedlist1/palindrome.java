package linkedlist1;

public class palindrome {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node reverseList(Node node) {
        Node prev = null;
        Node curr = node;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    boolean palin(Node head) {
        if (head == null) {
            return true;
        }
        Node mid = middle(head);
        Node last = reverseList(mid.next);
        Node curr = head;
        while (last != null) {
            if (last.data != curr.data) {
                return false;
            }
            last = last.next;
            curr = curr.next;
        }
        return true;
    }

    public static void main(String[] args) {
        palindrome p = new palindrome();
        p.head = new Node(85);
        p.head.next = new Node(15);
        p.head.next.next = new Node(4);
        p.head.next.next.next = new Node(25);
        p.head.next.next.next = new Node(85);
        boolean ans = p.palin(head);
        if (ans == true) {
            System.out.println("palindrome linked list");
        } else {
            System.out.println("not a palindrome linked list");
        }
    }
}
