1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int[] last = new int[128]; // ASCII
4        int left = 0;
5        int maxLen = 0;
6
7        for (int right = 0; right < s.length(); right++) {
8            char c = s.charAt(right);
9
10            // Jump left pointer directly
11            left = Math.max(left, last[c]);
12
13            maxLen = Math.max(maxLen, right - left + 1);
14
15            // Store next position (right + 1)
16            last[c] = right + 1;
17        }
18
19        return maxLen;
20    }
21    
22}