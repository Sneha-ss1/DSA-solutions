1class Solution {
2    public boolean isMatch(String s, String p) {
3        int m = s.length();
4        int n = p.length();
5
6        boolean[][] dp = new boolean[m + 1][n + 1];
7        dp[0][0] = true;
8
9    
10        for (int j = 2; j <= n; j++) {
11            if (p.charAt(j - 1) == '*') {
12                dp[0][j] = dp[0][j - 2];
13            }
14        }
15
16        for (int i = 1; i <= m; i++) {
17            for (int j = 1; j <= n; j++) {
18                char sc = s.charAt(i - 1);
19                char pc = p.charAt(j - 1);
20
21                if (pc == sc || pc == '.') {
22                    dp[i][j] = dp[i - 1][j - 1];
23                } else if (pc == '*') {
24               
25                    dp[i][j] = dp[i][j - 2];
26
27                   
28                    char prev = p.charAt(j - 2);
29                    if (prev == sc || prev == '.') {
30                        dp[i][j] = dp[i][j] || dp[i - 1][j];
31                    }
32                }
33            }
34        }
35
36        return dp[m][n];
37    }
38}
39