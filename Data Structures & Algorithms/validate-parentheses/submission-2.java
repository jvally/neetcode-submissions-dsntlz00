class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> parantheses = new HashMap<>();
        //add to stack until u dont find the closing 
        //if u rch end of string b4 finding the matching partheses then false
        parantheses.put('}', '{');
        parantheses.put(')','(');
        parantheses.put(']','[');
        for (char c: s.toCharArray()){
            if(parantheses.containsKey(c)){//if closing bracket
                if(!stack.empty() && stack.peek() == parantheses.get(c)){
                    stack.pop();//if stack not empty n closing bracket opened then valid 
                } else{
                    return false;
                } 
            } else{
                stack.push(c);//if not closing then append to stack
            }
        }
        return stack.isEmpty();//if any unclosed parantheses exist

    }
}
