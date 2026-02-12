package Stack;

public class Stack_LikedList {
    public static void main(String[] args) {
        myStack stack = new myStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(9);
        stack.push(10);
        stack.push(12);
        stack.display();
        System.out.println("popped element "+stack.pop());
        stack.display();
    }
}


class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;

    }
    // Node head;
}


class myStack{
    private Node top;
    public void push(int val){
        Node temp = new Node(val);
        temp.next = top;
        top =  temp;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is underflow");
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }

        return top.data;
    }

    public void display(){
        Node curr = top;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
}


