1class Solution {
2    public boolean isPalindrome(int x) {
3        if (x < 0 || (x % 10 == 0 && x != 0)) {
4            return false;
5        }
6
7        int reversedHalf = 0;
8
9        while (x > reversedHalf) {
10            reversedHalf = reversedHalf * 10 + x % 10;
11            x /= 10;
12        }
13
14        return x == reversedHalf || x == reversedHalf / 10;
15    }
16}
17