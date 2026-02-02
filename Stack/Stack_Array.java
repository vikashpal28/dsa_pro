package Stack;

class mystack{
    private int[] arr;
    private int capacity;
    private int top;

    public mystack(int cap){
        capacity = cap;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int num){
        if(top == capacity -1){
            System.out.println("stack is overflow");
        }

        arr[++top] = num;
    }

    public int pop(){
        if(top == -1){
            System.out.println("stack is underflow");
        }
        return arr[top--];
    }

    public int peek(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1;
        }
      return arr[top];
    }

     // check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

}

public class Stack_Array {

    public static void main(String[] args) {
       mystack st = new mystack(4);

        // pushing elements
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // popping one element
        System.out.println("Popped: " + st.pop());

        // checking top element
        System.out.println("Top element: " + st.peek());

        // checking if stack is empty
        System.out.println("Is stack empty: " +
                            (st.isEmpty() ? "Yes" : "No"));

        // checking if stack is full
        System.out.println("Is stack full: " +
                            (st.isFull() ? "Yes" : "No"));

    }
    
}
