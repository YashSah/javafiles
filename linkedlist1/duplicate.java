package linkedlist1;

//duplicate a linked list with a random pointer
public class duplicate {
    static Node head;

    static class Node {
        int data;
        Node next;
        Node random;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node duplicateLL(Node head) {
        // Inserting new nodes in between
        Node cur = head;
        while (cur != null) // setting random pointer of new nodes
        {
            Node temp = cur.next;
            cur.next = new Node(cur.data);
            cur.next.next = temp;
            cur = temp;
        }
        cur = head;

        while (cur != null) {
            if (cur.next != null) {
                cur.next.random = (cur.random != null) ? cur.random.next : null;
            }
            cur = cur.next.next;
        }
        Node orig = head;
        Node copy = head.next;
        Node temp = copy; // seperate both the lists

        while (orig != null) {
            orig.next = orig.next.next;
            copy.next = copy.next.next;
            orig = orig.next;
            copy = copy.next;
        }
        return temp;
    }

    public static void main(String args[]) {
        Node head = new Node(20);
        head.next = new Node(4);
        head.next.next = new Node(15);
        head.next.next.next = new Node(10);
        Node ans = duplicateLL(head);
        System.out.println(ans);
    }
}
