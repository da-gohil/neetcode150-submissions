class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int start = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();
        
        int end = 0;
        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                maxLen = Math.max(maxLen, end - start);
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        
        return maxLen;
    }
}