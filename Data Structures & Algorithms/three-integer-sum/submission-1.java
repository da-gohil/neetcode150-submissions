class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //first check for NPE and elements present check
        if(nums == null || nums.length < 3){
            return new ArrayList<>();
        }

        // sort the array
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<nums.length - 2; i++){
            
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int leftPointer = i + 1;
            int rightPointer = nums.length - 1;

            while(leftPointer < rightPointer){
                int sum = nums[i] + nums[leftPointer] + nums[rightPointer];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[leftPointer], nums[rightPointer]));
                    leftPointer++;
                    rightPointer--;

                    //skipping the duplicates
                    while(leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer - 1]){
                        leftPointer++;
                    }
                    while(leftPointer < rightPointer && nums[rightPointer] == nums[rightPointer + 1]){
                        rightPointer--;
                    }
                }else if(sum > 0){
                    rightPointer--;
                }else{
                    leftPointer++;
                }
            }
        }
        return result;
    }
}
