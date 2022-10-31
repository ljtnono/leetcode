package cn.ljtnono.leetcode.array;

/**
 * LeetCode #27
 *
 * @author Ling, Jiatong
 * Date: 2022/4/3 20:31
 */
public class LeetCode27 {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int del = 0;
        while (i < nums.length) {
            if (nums[i] == val) {
                // 将后面的元素全部网前移动一位
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                del++;
            }
            if (nums[i] != val) {
                i++;
            }
        }
        return nums.length - del + 1;
    }

}
