package code;

public class MoveZeroes {

    /***
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *
     * Note that you must do this in-place without making a copy of the array.
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        for (int left = 0; left < nums.length; left++) {
            for (int nextLeft = left + 1; nextLeft < nums.length; nextLeft++) {
                if (nums[left] == 0) {
                    int tmp = nums[nextLeft];
                    nums[nextLeft] = nums[left];
                    nums[left] = tmp;
                }
            }
        }
    }

    public static void main(String[] a) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }
}
