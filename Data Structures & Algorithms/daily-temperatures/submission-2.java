class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
            
        if(temperatures == null || temperatures.length == 0){
            return new int[0];
        }

        int[] result = new int[temperatures.length];
        
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i =0; i<temperatures.length; i++){

            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prevDay = stack.pop();
                result[prevDay] = i - prevDay;
            }    
            stack.push(i);
        }   
        return result;
    }
}
