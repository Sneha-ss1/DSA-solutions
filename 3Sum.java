1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6        Arrays.sort(nums);
7
8        int n = nums.length;
9
10        for (int i = 0; i < n - 2; i++) {
11
12            if (i > 0 && nums[i] == nums[i - 1]) {
13                continue;
14            }
15
16            int left = i + 1;
17            int right = n - 1;
18
19            while (left < right) {
20                int sum = nums[i] + nums[left] + nums[right];
21
22                if (sum == 0) {
23                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
24
25                    while (left < right && nums[left] == nums[left + 1]) {
26                        left++;
27                    }
28                    while (left < right && nums[right] == nums[right - 1]) {
29                        right--;
30                    }
31
32                    left++;
33                    right--;
34
35                } else if (sum < 0) {
36                    left++;
37                } else {
38                    right--;
39                }
40            }
41        }
42
43        return result;
44    }
45}
46