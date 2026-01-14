1public class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        for (int i = 0; i < nums.length; i++) {
4            for (int j = i + 1; j < nums.length; j++) {
5                if (nums[i] + nums[j] == target) {
6                    return new int[] { i, j };
7                }
8            }
9        }
10        throw new IllegalArgumentException("No two sum solution");
11    }
12
13    public static void main(String[] args) {
14        Solution sol = new Solution();
15
16        int[] nums = {2, 7, 11, 15};
17        int target = 9;
18
19        int[] result = sol.twoSum(nums, target);
20
21        System.out.println("Indices: " + result[0] + ", " + result[1]);
22    }
23};