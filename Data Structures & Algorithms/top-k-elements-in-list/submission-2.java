class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0)
            return new int[0];

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Fill Buckets based on frequency
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }

        int[] result = new int[k];
        int idx = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    if (idx < k) {
                        result[idx] = num;
                        idx++;
                    }
                }
            }
        }
        return result;
    }
}
