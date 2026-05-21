class Solution {
    public int[] productExceptSelf(int[] nums) {
        // classix prefix and suffix sum
        //checking the NPE and empty array
        if(nums == null || nums.length == 0){
            return new int[0];
        }

        int n = nums.length;
        int [] result = new int[n];

        //build prefix(left products)
        result[0] = 1;
        for(int i=1; i<n; i++){
            result[i] = result[i-1] * nums[i-1];
        }

        //pass 2: multiply suffix products in place
        int suffix = 1;
        for(int i = n - 1; i>=0; i--){
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }
}  
