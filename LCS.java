class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }

        int longest = 0;

        for (int it : st) {
            if (!st.contains(it - 1)) {
                int x = it;
                int count = 1;
                while (st.contains(x + 1)) {
                    x = x + 1;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
