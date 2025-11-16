package LikedList;

public class ListNode2 {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void printlist(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    
    public static Node RotateRight(Node head , int k){
         if (head == null || head.next == null || k == 0) return head;
        Node curr = head;

        int length = 1;
        while(curr.next != null){
            curr = curr.next;
            length++;
        }

        Node tail = curr;
        tail.next = head;

        k = k%length;

        int stepsToNewHead = length-k;

        Node newTail = tail;
        while (stepsToNewHead --> 0) {
            newTail = newTail.next;
        }
        Node newhead = newTail.next;
        newTail.next = null;
        return newhead;
    }

    public static void main(String[] args) {
        Node start = new Node(1);
        start.next = new Node(2);
        start.next.next = new Node(3);
        start.next.next.next = new Node(4);
        start.next.next.next.next = new Node(5);
        printlist(start);
        Node rotatedNode = RotateRight(start, 2);
        printlist(rotatedNode);
    }
}
