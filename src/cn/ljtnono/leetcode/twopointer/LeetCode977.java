package cn.ljtnono.leetcode.twopointer;

/**
 * LeetCode #977
 *
 * @author Ling, Jiatong
 * Date: 2022/4/1 23:31
 */
public class LeetCode977 {


    public int[] sortedSquares(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int[] result = new int[nums.length];
        int index = result.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[index--] = nums[left] * nums[left];
                ++left;
            } else {
                result[index--] = nums[right] * nums[right];
                --right;
            }
        }
        return result;
    }

}
