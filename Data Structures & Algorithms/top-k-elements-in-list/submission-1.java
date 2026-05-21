class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //The entry checkpoint for array --> default for all problems 
        if(nums == null || nums.length == 0 || k <= 0){
            return new int[0];
        }
        //1 Counted our frequencies for the elements
        // [K,V] K=> Number, V=> the occurences of the number
        Map<Integer, Integer> freqMap = new HashMap<>();
        //insertion operation to map number with their frequencies/ occurrences 
        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        //[(1,3), (2,2, (3,3)]

        //2 We need the top K elements
        //We can either use Method:01) PriorityQueue(Max Heap) or we can use Method 02) Bucket Sort
        List<Integer>[] buckets = new List[nums.length + 1];

        for(int key: freqMap.keySet()){     // [1,2,3]
            int freq = freqMap.get(key);

            if(buckets[freq] == null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(key);
        }

        //Returning the result in the desired format 
        int[] result = new int[k];
        int idx = 0;

        for(int i = buckets.length - 1; i >= 0 && idx < k; i--){
            if(buckets[i] != null){
                for(int res : buckets[i]){
                    if(idx < k){
                        result[idx++] = res;
                    }
                }
            }
        }
        return result;
    }
}
