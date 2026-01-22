1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int romanToInt(String s) {
6        Map<Character, Integer> values = new HashMap<>();
7        values.put('I', 1);
8        values.put('V', 5);
9        values.put('X', 10);
10        values.put('L', 50);
11        values.put('C', 100);
12        values.put('D', 500);
13        values.put('M', 1000);
14
15        int total = 0;
16
17        for (int i = 0; i < s.length(); i++) {
18            int curr = values.get(s.charAt(i));
19
20            if (i + 1 < s.length()) {
21                int next = values.get(s.charAt(i + 1));
22                if (curr < next) {
23                    total -= curr;
24                } else {
25                    total += curr;
26                }
27            } else {
28                total += curr;
29            }
30        }
31
32        return total;
33    }
34}
35