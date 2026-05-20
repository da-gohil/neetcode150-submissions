
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

//[1,1,1,2,2,3], k = 2
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if(nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }   
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create buckets based on frequency
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }

        int[] result = new int[k];
        int idx = 0;

        // Step 3: Collect the top k frequent elements from the buckets
        for(int i = buckets.length - 1; i >= 0 && idx < k; i--) {
            // If the bucket is not empty, add its elements to the result
            if(buckets[i] != null) {
                for(int num : buckets[i]) {
                    result[idx++] = num;
                    if(idx == k) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
