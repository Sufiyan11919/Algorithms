class missingNumber {
    public int missingNumberMethod(int[] nums) {
        int expSum = nums.length * (nums.length + 1) / 2;
        int actualSum = findSum(nums, 0);
        return expSum - actualSum;
    }
    public int findSum(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        }
        return nums[index] + findSum(nums, index + 1);
    }
}
