1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        // Ensure nums1 is the smaller array
4        if (nums1.length > nums2.length) {
5            return findMedianSortedArrays(nums2, nums1);
6        }
7
8        int m = nums1.length;
9        int n = nums2.length;
10        int low = 0, high = m;
11
12        while (low <= high) {
13            int partitionX = (low + high) / 2;
14            int partitionY = (m + n + 1) / 2 - partitionX;
15
16            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
17            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
18
19            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
20            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];
21
22            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
23                // Correct partition found
24                if ((m + n) % 2 == 0) {
25                    return (Math.max(maxLeftX, maxLeftY) +
26                            Math.min(minRightX, minRightY)) / 2.0;
27                } else {
28                    return Math.max(maxLeftX, maxLeftY);
29                }
30            } else if (maxLeftX > minRightY) {
31                high = partitionX - 1;
32            } else {
33                low = partitionX + 1;
34            }
35        }
36
37        throw new IllegalArgumentException("Input arrays are not sorted");
38    }
39}
40