1class Solution {
2    public String longestPalindrome(String s) {
3        if (s == null || s.length() < 1) {
4            return "";
5        }
6        int start = 0, end = 0;
7        for (int i = 0; i < s.length(); i++) {
8            int len1 = expandFromCenter(s, i, i);     
9            int len2 = expandFromCenter(s, i, i + 1);
10            int len = Math.max(len1, len2);
11            if (len > end - start) {
12                start = i - (len - 1) / 2;
13                end = i + len / 2;
14            }
15        }
16
17        return s.substring(start, end + 1);
18    }
19
20    private int expandFromCenter(String s, int left, int right) {
21        while (left >= 0 && right < s.length()
22                && s.charAt(left) == s.charAt(right)) {
23            left--;
24            right++;
25        }
26        return right - left - 1; 
27    }
28}
29