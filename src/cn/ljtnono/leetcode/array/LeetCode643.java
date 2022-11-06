package cn.ljtnono.leetcode.array;

import java.util.Arrays;

/**
 * LeetCode 643
 *
 * @author Ling, Jiatong
 * Date: 2022/11/6 18:37
 */
public class LeetCode643 {

    /**
     * 给你一个由 n 个元素组成的整数数组 nums 和一个整数 k 。
     *
     * 请你找出平均数最大且 长度为 k 的连续子数组，并输出该最大平均数。
     *
     * 任何误差小于 10-5 的答案都将被视为正确答案。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/maximum-average-subarray-i
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums
     * @param k
     * @return
     */
    public static double findMaxAverage(int[] nums, int k) {
        // 思路：采用滑动窗口算法
//        double currentMaxAvg = Integer.MIN_VALUE;
//        int winEnd;
//        if (nums.length == k) {
//            return Arrays.stream(nums).sum() * 1.0 / k;
//        }
//        for (int i = 0; i <= nums.length - k; i++) {
//            winEnd = i + k - 1;
//            if (getAvg(nums, i, winEnd) > currentMaxAvg) {
//                currentMaxAvg = getAvg(nums, i, winEnd);
//            }
//        }
//        return currentMaxAvg;
        // 以上算法正确，但是会超出时间限制，优化一下，先不计算平均值，找到最大值，最后一下再计算平均值
//        int currentSum = Integer.MIN_VALUE;
//        int winEnd = 0;
//        if (nums.length == k) {
//            return Arrays.stream(nums).sum() * 1.0 / k;
//        }
//        for (int i = 0; i <= nums.length - k; i++) {
//            winEnd = i + k - 1;
//            if (getSum(nums, i, winEnd) > currentSum) {
//                currentSum = getSum(nums, i, winEnd);
//            }
//        }
//        return currentSum * 1.0 / k;

        // 更加优化的滑动窗口算法
        int currentSum = 0;
        if (nums.length == k) {
            return Arrays.stream(nums).sum() * 1.0 / k;
        }
        // 先找前k个值的和
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        int maxSum = currentSum;
        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum + nums[i] - nums[i - k];
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum * 1.0 / k;
    }

    public static int getSum(int[] arr, int startIndex, int endIndex) {
        int result = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result += arr[i];
        }
        return result;
    }

    public static double getAvg(int[] arr, int startIndex, int endIndex) {
        int result = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result += arr[i];
        }
        return result * 1.0 / (endIndex - startIndex + 1);
    }



    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[] {0,1,1,3,3}, 4));
    }

}
