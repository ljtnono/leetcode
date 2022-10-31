package cn.ljtnono.leetcode.array;

/**
 * LeetCode #80
 *
 * @author Ling, Jiatong
 * Date: 2022/4/4 18:44
 */
public class LeetCode80 {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }

        int i = 0;
        int deleteNums = 0;
        while (i < nums.length - 2 - deleteNums) {
            // 如果有三个元素相同，那么将元素往前移动
            if ((nums[i] == nums[i + 1]) && (nums[i] == nums[i + 2])) {
                for (int j = i + 1; j < nums.length - 1 - deleteNums; j++) {
                    // 所有元素向左移动一位
                    nums[j] = nums[j + 1];
                }
                deleteNums++;
            } else {
                i++;
            }
        }

        return nums.length - deleteNums;
    }

}
