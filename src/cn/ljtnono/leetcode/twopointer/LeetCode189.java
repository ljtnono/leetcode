package cn.ljtnono.leetcode.twopointer;

/**
 * LeetCode #189
 *
 * @author Ling, Jiatong
 * Date: 2022/4/3 13:54
 */
public class LeetCode189 {

    public void rotate(int[] nums, int k) {
        if (k == 0 || nums.length == 1) {
            return;
        }
        k = k % nums.length;
        int[] copy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            copy[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(copy, 0, nums, 0, nums.length);
    }
}
