package linkedlist1;

public class reverseLinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;

        return newHead;
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

    public static void main(String args[]) {
        reverseLinkedList list = new reverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(5);
        list.head.next.next.next = new Node(20);
        System.out.println("given list is:");
        list.printList(head);
        System.out.println("reversed list is:");
        head = list.reverse(head);
        list.printList(head);

    }

}
