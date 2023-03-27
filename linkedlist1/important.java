package linkedlist1;

//Q>find the n th node from the last and delete that node.

public class important {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node removeNthFromEnd(Node head, int n) {
        if (head.next == null) {
            return null;
        }
        int size = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }
        int indexToSearch = size - n;
        Node prev = head;
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String args[]) {
        Node head = new Node(20);
        head.next = new Node(4);
        head.next.next = new Node(15);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(10);

        Node ans = removeNthFromEnd(head, 3);
        System.out.println(ans);
    }
}