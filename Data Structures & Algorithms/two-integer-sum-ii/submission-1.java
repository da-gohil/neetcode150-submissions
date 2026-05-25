class Solution {
    public int[] twoSum(int[] numbers, int target) {

    //NPE and empty array check
    if(numbers == null || numbers.length < 2){
        return new int [0];
    }
    //step 01
    int leftPointer = 0, rightPointer = numbers.length - 1;
    int sum = 0;

    while(leftPointer < rightPointer){

        sum = numbers[leftPointer] + numbers[rightPointer];
        if(sum > target){
            rightPointer--;
        }else if(sum < target){
            leftPointer++;
        }else{
            return new int[]{leftPointer + 1, rightPointer + 1};
        }
    }
    return new int[0];
    }
}
