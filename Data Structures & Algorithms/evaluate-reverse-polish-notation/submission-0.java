class Solution {
    public int evalRPN(String[] tokens) {
        //we know the operators require 2 arguments so we keep pushing onto stack until we hit an operator then we pop 2 elements
        //first operand is the last to be popped

        Stack<Integer> stack = new Stack<>();
        for(String c: tokens){
            if(c.equals("+")){
                stack.push(stack.pop() + stack.pop());
            } else if(c.equals("*")){
                stack.push(stack.pop() * stack.pop());
            } else if(c.equals("-")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            } else if(c.equals("/")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first/ second);
            } else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}
