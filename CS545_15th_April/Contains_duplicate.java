class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        while (i < nums.length) {
            int num = nums[i];
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                return true; 
            }
            i++;
        }
        return false;
    }
}