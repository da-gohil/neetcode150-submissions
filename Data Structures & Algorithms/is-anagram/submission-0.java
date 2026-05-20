// s = "racecar" t = "carrace"

class Solution{
    public boolean isAnagram(String s, String t) {
        
        if(s == null || t == null){
            return false;
        }

        if(s.length() != t.length()){
            return false;
        }
        //Approach 01 using two frequency counters
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();

        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();

        // Trim
        // Remove spaces
        // compare the frequencies of both

        for(char c : char1){
            freq1.put(c, freq1.getOrDefault(c,0) + 1);
        }

        for(char c : char2){
            freq2.put(c, freq2.getOrDefault(c,0) + 1);
        }

        return freq1.equals(freq2);
    }
}
