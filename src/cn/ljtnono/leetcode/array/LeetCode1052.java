package cn.ljtnono.leetcode.array;

/**
 * LeetCode 1052
 *
 * @author Ling, Jiatong
 * Date: 2022/11/7 00:23
 */
public class LeetCode1052 {


    /**
     * 有一个书店老板，他的书店开了n分钟。每分钟都有一些顾客进入这家商店。给定一个长度为 n 的整数数组 customers ，其中 customers[i] 是在第 i 分钟开始时进入商店的顾客数量，所有这些顾客在第 i 分钟结束后离开。
     *
     * 在某些时候，书店老板会生气。 如果书店老板在第 i 分钟生气，那么 grumpy[i] = 1，否则 grumpy[i] = 0。
     *
     * 当书店老板生气时，那一分钟的顾客就会不满意，若老板不生气则顾客是满意的。
     *
     * 书店老板知道一个秘密技巧，能抑制自己的情绪，可以让自己连续minutes分钟不生气，但却只能使用一次。
     *
     * 请你返回 这一天营业下来，最多有多少客户能够感到满意 。
     *
     * <p>
     * 输入：customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3
     * 输出：16
     * 解释：书店老板在最后 3 分钟保持冷静。
     * 感到满意的最大客户数量 = 1 + 1 + 1 + 1 + 7 + 5 = 16.
     * </p>
     * @param customers
     * @param grumpy
     * @param minutes
     * @return
     */
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        // 思路：求customers数组中长度为minutes的子数组的区间下标
        int sum = 0, len = customers.length;
        for (int i = 0; i < len; i++) {
            if (grumpy[i] == 0){
                sum += customers[i];
                customers[i] = 0;
            }
        }
        int num = customers[0];
        int maxval = customers[0];
        for (int i = 1; i < len; i++){
            if (i < minutes) num = num + customers[i];
            else num = num + customers[i] - customers[i - minutes];
            maxval = Math.max(maxval, num);
        }

        return (sum + maxval);
    }

    public static int getSum(int[] arr, int startIndex, int endIndex) {
        int result = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result += arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxSatisfied(new int[] {2, 6, 6, 9}, new int[] {0, 0, 1, 1}, 1));
    }

}

