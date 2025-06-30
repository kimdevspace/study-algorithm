import java.util.*;

class Solution {
    
    int min, max;

    public String longestPalindrome(String s) {
        
        int len = s.length();

        if (len < 2) {
            return s;
        }

        for (int i = 0; i < len - 1; i++) {
            twoPointer(s, i, i + 1);
            twoPointer(s, i, i + 2);
        }
        
        return s.substring(min, min + max);
    }

    public void twoPointer(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        if (max < r - l - 1) {
            min = l + 1;
            max = r - l - 1;
        }
    }
}