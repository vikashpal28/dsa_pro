package LikedList;

import miscelleous1.soulution17;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LikedList3 {

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }


    public static Node removeDuplicateNode(Node head) {
        if (head == null) return null;

        Node dummy = new Node(0, head);
        // System.out.println("dummy "+dummy.data);
        Node prev = dummy;
        // System.out.println("prev "+prev.data);
        Node curr = head;

        while (curr != null) {
            if (curr.next != null && curr.data == curr.next.data) {
                // Skip all nodes with this value
                while (curr.next != null && curr.data == curr.next.data) {
                    curr = curr.next;
                    System.out.println("curr.data "+curr.data);
                    System.out.println("curr.next "+curr.next.data);
                    
                }
                System.out.println("perv.next.data "+prev.next.data);
                prev.next = curr.next; // link to node after duplicates
                
            } else {
                prev = prev.next; // move prev forward
            }
            curr = curr.next;
        }

        return dummy.next;
    }

    // Main method to test
    public static void main(String[] args) {
        // Build linked list: 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);

        System.out.println("Original list:");
        printList(head);

        head = removeDuplicateNode(head);

        System.out.println("After removing duplicates:");
        printList(head);
    }
}
