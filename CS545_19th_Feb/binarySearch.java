public class binarySearch {
    public int search(int[] nums, int target) {
        return binSearch(nums, target, 0, nums.length - 1);
    }
    
    public int binSearch(int[] nums, int target, int l, int r) {
        if (l <= r) {
            //this is to avoid going out of bound for integer capacity
            // if both l and r are near to 2^32-1 then the addition will 
            // more then the capacity of int datatype and it will give incorrect output
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                return binSearch(nums, target, m + 1, r);
            } else {
                return binSearch(nums, target, l, m - 1);
            }
        }
        return -1;
    }
}
