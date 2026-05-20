//{3,4,5,6} target = 7

public class Solution{
    public int[] twoSum(int[] nums, int k){

        if(nums == null || nums.length == 0){
            return new int[0];
        }
        // The below code fails when the array is not sorted 

        // int leftPointer = 0;
        // int rightPointer = nums.length - 1;
        // while(leftPointer < rightPointer){
        //     int sum = nums[leftPointer] + nums[rightPointer];
        //     if(sum == k){
        //         return new int[]{leftPointer, rightPointer};
        //     }else if(sum < k){
        //         leftPointer++;
        //     }else{
        //         rightPointer--;
        //     }
        // }
        // return new int[0];

        //to fix this we use a HashMap to store the numbers and their indices

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = k - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}