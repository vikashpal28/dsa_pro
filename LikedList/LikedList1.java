package LikedList;

public class LikedList1 {
    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next; // save the next node
            current.next = prev; // reverse the pointor
            prev = current; //move prev forword
            current = next; // move current forword
        }
        return prev; // new head of reverse list
    }

    public static void printList(Node head){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        // 🔗 Link the nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        printList(a);
       Node reversedHead = reverse(a);
        printList(reversedHead);
    }
}
