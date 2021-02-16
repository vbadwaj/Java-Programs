class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)return false;
        Stack<Character> input= new Stack<>();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(temp=='(' || temp=='{' || temp=='['){
                input.push(temp);
            }
            else if(temp==')' && !input.isEmpty() && input.peek()=='(' ){
                input.pop();
            }
            else if(temp=='}'&& !input.isEmpty() && input.peek()=='{'){
                input.pop();
            }
            else if(temp==']' && !input.isEmpty() && input.peek()=='[' ){
                input.pop();
            }
            else return false;
        }
        return input.isEmpty();
        
    }
}
