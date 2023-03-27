package linkedlist1;

public class reverse {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node reverseList(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void printList(Node node) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        } else {
            Node curNode = head;
            while (curNode != null) {
                System.out.print(curNode.data + "--->");
                curNode = curNode.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        reverse ll = new reverse();
        ll.head = new Node(85);
        ll.head.next = new Node(15);
        ll.head.next.next = new Node(4);
        ll.head.next.next.next = new Node(20);

        System.out.println("given linked list:");
        ll.printList(head);

        System.out.println("reversed list is:");
        head = ll.reverseList(head);
        ll.printList(head);
    }
}
