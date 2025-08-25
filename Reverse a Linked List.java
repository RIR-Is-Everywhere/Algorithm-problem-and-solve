//Problem: Implement an algorithm to reverse a linked list. 

class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class ReverseLinkedList {
    static Node head;

    Node reverse(Node node) {
        Node prev = null, curr = node, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.print("Original List: ");
        list.printList(head);

        head = list.reverse(head);
        System.out.print("\nReversed List: ");
        list.printList(head);
    }
}
