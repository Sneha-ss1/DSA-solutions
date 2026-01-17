1class Solution {
2    public int reverse(int x) {
3        int result = 0;
4        while (x != 0) {
5        int digit = x % 10;
6        x /= 10;
7        if (result > Integer.MAX_VALUE / 10 ||
8            (result == Integer.MAX_VALUE / 10 && digit > 7)) {
9            return 0;
10        }
11        if (result < Integer.MIN_VALUE / 10 ||
12        (result == Integer.MIN_VALUE / 10 && digit < -8)) {
13        return 0;
14            }
15            result = result * 10 + digit;
16        }
17        return result;
18    }
19}
20