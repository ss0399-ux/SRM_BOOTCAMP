class Solution {

    public int robFrom(int i, int[] nums) {

        if (i >= nums.length) return 0;
        int include = nums[i] + robFrom(i + 2, nums);
        int exclude = robFrom(i + 1, nums);
        return Math.max(inlclude, exclude);
    }

    public int rob(int[] nums) {
        return robFrom(0, nums);
    }
}
