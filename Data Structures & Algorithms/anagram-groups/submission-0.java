// strs = ["act","pots","tops","cat","stop","hat"]

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        } 

        Map<String, List<String>> map = new HashMap<>();
        // Iterate through each string in the input array
        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);

            // sorted char array will be the key for anagrams
            String key = new String(charArr);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
