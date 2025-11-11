package LikedList;

public class Likedlist {
    
    public static class Node{
        int data ;
        Node next;
        Node(int data){
        this.data = data;
        this.next = null;
        }
    }
   

    public static void printlist(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
        
    }
    public static void printlistRecursive(Node head){
       if(head == null) return;
       System.out.print(head.data+"->");
       printlistRecursive(head.next); 
    }


    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(9);
        Node e = new Node(10);

        // System.out.println(a); //Likedlist$Node@2a139a55
        // System.out.println(a.next); //null
        // here we do not connect node a to node b and wise-verse
        a.next = b;
        // System.out.println(a.next); //Likedlist$Node@15db9742
        // System.out.println(b);  //Likedlist$Node@15db9742
        // after connecting node a and node b have save address
        b.next = c;
        c.next = d;
        d.next = e;
        printlist(a);
        printlistRecursive(a);

    }
}
