// Time complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxArea(int[] heights) {
        
        if(heights == null || heights.length < 2){
            return 0;
        }

        int leftPointer = 0, rightPointer = heights.length - 1;
        int result = 0;

        while(leftPointer < rightPointer){
            int height = Math.min(heights[leftPointer], heights[rightPointer]);
            int width = rightPointer - leftPointer;
            int area = width * height;
            result = Math.max(result, area);

            if(heights[leftPointer] < heights[rightPointer]){
                leftPointer++;
            }else{
                rightPointer--;
            }
        }
        return result;
    }
}
