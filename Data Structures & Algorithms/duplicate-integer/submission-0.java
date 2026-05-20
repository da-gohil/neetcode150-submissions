// {1,2,3,3}

class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        //Since it is duplicates we can either use arraylist, map, set
        //Here I personally like using set because we only have to return true / false

        if(nums.length == 0 || nums == null){
            return false;
        }

        Set<Integer> resultSet = new HashSet<>();

        for(int num: nums){
            if(!resultSet.add(num)){
                return true;
            }
        }
        return false;
    }
}