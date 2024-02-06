public class SortByParity {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            while (l < r) {
                if (nums[l]%2 == 0) {
                    l++;
                } else {
                    break;
                }
            }
            while (l < r) {
                if (nums[r]%2 != 0) {
                    r--;
                } else {
                    break;
                }
            }
            if (l < r) {
                swap(nums, l, r);
                l++;
                r--;
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums1 = {3, 1, 2, 4 , 3};
        int[] result1 = sortArrayByParity(nums1);
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        int[] nums2 = {0};
        // int[] result2 = sortArrayByParity(nums2);

    }
}
