class Solution {
    public int trap(int[] height) {

        if(height == null || height.length < 2) return 0;

        int leftPointer = 0, rightPointer = height.length - 1;
        int maxLeft = height[0], maxRight = height[rightPointer];
        int result = 0;

        while(leftPointer < rightPointer){
            if(maxLeft < maxRight){
                leftPointer++;
                maxLeft = Math.max(maxLeft, height[leftPointer]);
                result += maxLeft - height[leftPointer];
            }else{
                rightPointer--;
                maxRight = Math.max(maxRight, height[rightPointer]);
                result += maxRight - height[rightPointer];
            }
        }
        return result;
    }
}