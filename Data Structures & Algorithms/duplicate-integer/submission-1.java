class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        //checker
        if(nums == null || nums.length < 2) return false;

        Set<Integer> set = new HashSet<>();
        for(int num: nums){

            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}