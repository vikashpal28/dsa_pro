package Intermediate;

import java.util.Stack;

public class solution5 {
    public int calcaulate(String s){
        Stack<Integer> stack = new Stack<>();
        char sign = '+';
        int num = 0;


        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);

           

              if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            if(!Character.isDigit(c) && c != ' ' || i == s.length()-1){
                if(sign == '+'){
                    stack.push(num);
                }
                else if(sign == '-'){
                    stack.push(-num);
                }
                else if(sign == '*'){
                    stack.push(stack.pop() * num);
                }
                else if(sign == '/'){
                    stack.push(stack.pop() / num);
                }
                sign = c;
                num = 0;
            } 
        }
         int result = 0;
        for(int val : stack) result += val;
        return result;
    }
    public static void main(String[] args) {
        String s = "1+2*3";
        solution5 obj = new solution5();
        System.out.println(obj.calcaulate(s));
    }
}
