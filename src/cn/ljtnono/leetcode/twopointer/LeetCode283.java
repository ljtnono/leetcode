package cn.ljtnono.leetcode.twopointer;

/**
 * LeetCode 283
 *
 * @author Ling, Jiatong
 * Date: 2022/4/2 01:06
 */
public class LeetCode283 {


    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
