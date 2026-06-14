class TimeMap {

    Map<String, List<int[]>> map;
    // int[] stores [timestamp, index] and we keep values separately
    // Actually cleanest: store pairs as Object[] or use two lists

    Map<String, List<Integer>> timeMap;
    Map<String, List<String>> valueMap;

    public TimeMap() {
        timeMap = new HashMap<>();
        valueMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        timeMap.putIfAbsent(key, new ArrayList<>());
        valueMap.putIfAbsent(key, new ArrayList<>());
        timeMap.get(key).add(timestamp);
        valueMap.get(key).add(value);
    }

    public String get(String key, int timestamp) {
        if(!timeMap.containsKey(key)) return "";

        List<Integer> times = timeMap.get(key);
        List<String> vals = valueMap.get(key);

        int left = 0, right = times.size() - 1;
        String result = "";

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(times.get(mid) <= timestamp){
                result = vals.get(mid);  // valid candidate, try right for larger timestamp
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return result;
    }
}