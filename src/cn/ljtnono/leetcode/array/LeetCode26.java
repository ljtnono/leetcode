package cn.ljtnono.leetcode.array;

/**
 * LeetCode 26
 *
 * @author Ling, Jiatong
 * Date: 2022/3/17 23:21
 */
public class LeetCode26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }
}
