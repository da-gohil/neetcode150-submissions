class Solution {
    public int evalRPN(String[] tokens) {

        //initial filter pass 
        if(tokens == null || tokens.length == 0){
            return 0;
        }

        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i=0; i<tokens.length; i++){
            
            String token = tokens[i];
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){

                int b = stack.pop();
                int a = stack.pop();

                switch(token){
                    case "+": stack.push(a+b); break;
                    case "-": stack.push(a-b); break;
                    case "*": stack.push(a*b); break;
                    case "/": stack.push(a/b); break;
                }
            }else{
                stack.push(Integer.parseInt(token));
            }
        } 
        return stack.pop();
    }
}