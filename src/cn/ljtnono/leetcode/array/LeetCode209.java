package cn.ljtnono.leetcode.array;

import java.util.Arrays;

/**
 * LeetCode #209
 *
 * @author Ling, Jiatong
 * Date: 2022/11/03 01:13
 */
public class LeetCode209 {


    /**
     * 给定一个含有n正整数的数组和一个正整数 target 。
     * <p>
     * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/minimum-size-subarray-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * <p>
     * 思路：采用滑动窗口算法
     *
     * @param target
     * @param nums
     * @return
     */
    public static int minSubArrayLen(int target, int[] nums) {
        // 思路1 暴力解决
//        if (nums.length == 1) {
//            if (nums[0] >= target) {
//                return 1;
//            } else {
//                return 0;
//            }
//        }
//        if (Arrays.stream(nums).sum() < target) {
//            return 0;
//        }
//
//        int currentMinLength = nums.length;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = nums.length - 1; j >= i; j--) {
//                int sum = getSum(nums, i, j);
//                if (sum >= target && j - i + 1 <= currentMinLength) {
//                    currentMinLength = j - i + 1;
//                }
//            }
//        }
//        return currentMinLength;

        // 思路2 滑动窗口
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int i = 0;
        int subLength;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                subLength = j - i + 1;
                result = result < subLength ? result : subLength;
                sum -= nums[i++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;

    }

    public static int getSum(int[] arr, int startIndex, int endIndex) {
        int sum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            sum += arr[i];
        }
        return sum;
    }

//    public static void main(String[] args) {
//        System.out.println(minSubArrayLen(4, new int[]{
//
//        }));
//    }
}
