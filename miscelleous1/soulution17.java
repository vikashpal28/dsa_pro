package miscelleous1;

import java.util.Stack;

public class soulution17 {
    public static int longestValidParentheses(String s) {
    Stack<Integer> stack = new Stack<>();
    stack.push(-1);
    int maxlen = 0;
    for(int i = 0;i<s.length();i++){
        if (s.charAt(i) == '(') {
            stack.push(i);
        }
        else{
            stack.pop();
            if(stack.isEmpty()){
                stack.push(i); // reset the stack
            }
            else{
                maxlen = Math.max(maxlen, i-stack.peek());
            }
        }
    }
    return maxlen;
    }
    public static void main(String[] args) {
        String str = "(()";
        System.out.println(longestValidParentheses(str));
    }
}
