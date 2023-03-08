package cn.ljtnono.leetcode.array;

import java.util.Arrays;

/**
 * LeetCode1658
 *
 * @author Ling, Jiatong
 * Date: 2022/11/9 11:10
 */
public class LeetCode1658 {


    /**
     * 给你一个整数数组 nums 和一个整数 x 。每一次操作时，你应当移除数组 nums 最左边或最右边的元素，然后从 x 中减去该元素的值。请注意，需要 修改 数组以供接下来的操作使用。
     *
     * 如果可以将 x恰好 减到0 ，返回 最小操作数 ；否则，返回 -1 。
     *
     *
     * 示例 1：
     *
     * 输入：nums = [1,1,4,2,3], x = 5
     * 输出：2
     * 解释：最佳解决方案是移除后两个元素，将 x 减到 0 。
     * 示例 2：
     *
     * 输入：nums = [5,6,7,8,9], x = 4
     * 输出：-1
     * 示例 3：
     *
     * 输入：nums = [3,2,20,1,1,3], x = 10
     * 输出：5
     * 解释：最佳解决方案是移除后三个元素和前两个元素（总共 5 次操作），将 x 减到 0 。
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/minimum-operations-to-reduce-x-to-zero
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *
     * @param nums
     * @param x
     * @return
     */
    public int minOperations(int[] nums, int x) {
        // 思路：求和为数组元素和减去x的最多元素的滑动窗口
        int numsSum = Arrays.stream(nums).sum();
        int currentSum = 0;
        int left = 0;
        int right = 0;
        int result = -1;
        while (right < nums.length) {
            // 当右边没到边界时，一直加
            currentSum += nums[right];
            right++;
            while (currentSum > numsSum - x && left < nums.length) {
                currentSum -= nums[left++];
            }
            if (currentSum == numsSum - x) {
                result = Math.max(result, right - left);
            }

        }
        return result == -1 ? -1 : nums.length - result;
    }

}
