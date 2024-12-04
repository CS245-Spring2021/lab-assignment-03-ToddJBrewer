/**
 * NO EXTERNAL LIBRARIES OR PACKAGES SHOULD BE IMPORTED
 * Sorts an array into WiggleSort format
 *
 * @author 
 */
public class WiggleSort {


    /**
     * Given an integer array nums, reorders it such that nums[0] < nums[1]  >  nums[2] <  nums[3]...
     *
     * @param nums array to sort
     * @return sorted array
     */

    //original solution which failed some edge cases
    public static int[] wiggleSortOld(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (i % 2 == 0 && nums[i] > nums[i + 1]) {
                swap(nums, i, i + 1);
            }
            if (i % 2 != 0 && nums[i] < nums[i + 1]) {
                swap(nums, i, i + 1);
            }
        }
        return nums;
    }

    //sorts the array, then splits it into two arrays: smallest half (left) and biggest half (right)
    //Then places them back into the original array in alternating fashion, beginning with the left array
    public static int[] wiggleSort(int[] nums) {
        sort(nums);
        int[] left = new int[(nums.length + 1) / 2];
        int[] right = new int[nums.length - left.length];
        for (int i = 0; i < nums.length; i++) {
            if (i < left.length) {
                left[i] = nums[i];
            } else {
                right[i - left.length] = nums[i];
            }
        }
        int index = 0, l = 0, r = 0;
        while (index < nums.length) {
            if (index % 2 == 0) {
                nums[index++] = left[l++];
            } else {
                nums[index++] = right[r++];
            }
        }
        return nums;
    }

    //function to sort the array numerically from smallest to largest number
    public static int[] sort(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1])
                    swap(nums, j, j + 1);
            }
        }
        return nums;
    }

    //sort swap function
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}