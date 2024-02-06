public class SortColors {
    public static void shellSort(int[] nums) {
        for (int gap = nums.length/ 2; gap > 0; gap = gap/ 2) {
            for (int i = gap; i < nums.length; i++) {
                int temp = nums[i];
                int j = i;
                // condition needs to be check again
                while (j >= gap && nums[j-gap] > temp) {
                    nums[j] = nums[j-gap];
                    j = j - gap;
                }
                nums[j] = temp;
            }
        }
    }

   


    public static void main(String[] args) {
        System.out.println("1st test case: ");
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        shellSort(nums1);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        System.out.println("2nd test case: ");
        int[] nums2 = {2, 0, 1};
        shellSort(nums2);

    }

}
