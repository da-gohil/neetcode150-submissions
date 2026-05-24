class Solution {
    public int[] twoSum(int[] numbers, int target) {

        if(numbers == null || numbers.length < 2){
            return new int[0];
        }

        int leftPointer = 0, rightPointer = numbers.length - 1;
        int sum = 0;
        while(leftPointer < rightPointer){
            sum = numbers[leftPointer] + numbers[rightPointer];

            if(sum < target){
                leftPointer++;
            }else if(sum > target){
                rightPointer--;
            }else{
                return new int[]{leftPointer + 1, rightPointer + 1};
            }
        }     
        return new int[0];       
    }
}
