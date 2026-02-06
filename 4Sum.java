1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> fourSum(int[] nums, int target) {
5        List<List<Integer>> result = new ArrayList<>();
6        int n = nums.length;
7        if (n < 4) return result;
8
9        Arrays.sort(nums);
10
11        for (int i = 0; i < n - 3; i++) {
12       
13            if (i > 0 && nums[i] == nums[i - 1]) continue;
14
15            for (int j = i + 1; j < n - 2; j++) {
16                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
17
18                int left = j + 1;
19                int right = n - 1;
20
21                while (left < right) {
22                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
23
24                    if (sum == target) {
25                        result.add(Arrays.asList(
26                                nums[i], nums[j], nums[left], nums[right]
27                        ));
28
29                        left++;
30                        right--;
31
32                        // skip duplicates
33                        while (left < right && nums[left] == nums[left - 1]) left++;
34                        while (left < right && nums[right] == nums[right + 1]) right--;
35                    } 
36                    else if (sum < target) {
37                        left++;
38                    } 
39                    else {
40                        right--;
41                    }
42                }
43            }
44        }
45        return result;
46    }
47}
48