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
                    stack.pop();
                } else{
                    return false;
                } 
            } else{
                stack.push(c);
            }
        }
        return stack.isEmpty();

    }
}
