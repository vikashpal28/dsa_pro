package LikedList;

class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

public class MergeSortedList {
    
    public static Node mergeTwoList(Node l1 , Node l2){
        Node dummy = new Node(-1);
        Node current  = dummy;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                current.next = l1;
                l1 = l1.next;
            }
            else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        // rest element to be added
        current.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

    public static void printNode(Node head){
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }
   public static void main(String[] args) {
    Node l1 = new Node(1);
    l1.next = new Node(3);
    l1.next.next = new Node(5);

    Node l2 = new Node(2);
    l2.next = new Node(4);
    l2.next.next = new Node(6);

    Node merged = mergeTwoList(l1, l2);
    printNode(merged);
   }
}
