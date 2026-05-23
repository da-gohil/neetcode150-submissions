class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        if (s.length() < 2) {
            return true;
        }

        int leftPointer = 0, rightPointer = s.length() - 1;

        while (leftPointer < rightPointer) {
            // skipping the non-alphanumeric characters
            if (!Character.isLetterOrDigit(s.charAt(leftPointer))) {
                leftPointer++;
            } else if (!Character.isLetterOrDigit(s.charAt(rightPointer))) {
                rightPointer--;
            } else {
                if (Character.toLowerCase(s.charAt(leftPointer))
                    != Character.toLowerCase(s.charAt(rightPointer))) {
                    return false;
                }
                leftPointer++;
                rightPointer--;
            }
        }
        return true;
    }
}