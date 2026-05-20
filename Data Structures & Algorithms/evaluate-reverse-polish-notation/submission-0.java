class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("/") || token.equals("*")){
                int n2 = stack.pop();
                int n1 = stack.pop();

                switch(token){
                    case "+": stack.push(n1 + n2); break;
                    case "-": stack.push(n1 - n2); break;
                    case "/": stack.push(n1 / n2); break; 
                    case "*": stack.push(n1 * n2); break;
                }
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
