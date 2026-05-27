class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        if(position == null || position.length == 0) return 0;

        int n = position.length;

        // Step 1 pair position and speed, sort by position descending
        int[][] cars = new int[n][2];
        for(int i = 0; i < n; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> b[0] - a[0]); // sort by position, closest to target first

        // Step 2 calculate time to reach target for each car
        // use a stack to count fleets
        Stack<Double> stack = new Stack<>();

        for(int[] car : cars){
            double time = (double)(target - car[0]) / car[1];

            if(stack.isEmpty() || time > stack.peek()){
                stack.push(time);  // new fleet
            }
            // else: this car is faster and catches up — joins the fleet ahead, don't push
        }

        return stack.size();
    }
}