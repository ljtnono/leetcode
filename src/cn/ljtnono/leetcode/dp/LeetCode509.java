package cn.ljtnono.leetcode.dp;

/**
 * LeetCode #509
 *
 * @author Ling, Jiatong
 * Date: 2022/4/8 15:48
 */
public class LeetCode509 {

    /**
     *
     * 斐波那契数（通常用F(n) 表示）形成的序列称为 斐波那契数列 。该数列由0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
     *
     * F(0) = 0，F(1)= 1
     * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
     * 给定n ，请计算 F(n) 。
     *
     *
     *
     * 示例 1：
     *
     * 输入：n = 2
     * 输出：1
     * 解释：F(2) = F(1) + F(0) = 1 + 0 = 1
     * 示例 2：
     *
     * 输入：n = 3
     * 输出：2
     * 解释：F(3) = F(2) + F(1) = 1 + 1 = 2
     * 示例 3：
     *
     * 输入：n = 4
     * 输出：3
     * 解释：F(4) = F(3) + F(2) = 2 + 1 = 3
     *
     *
     * 提示：
     *
     * 0 <= n <= 30
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/fibonacci-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *
     * @param n
     * @return
     */
    public int fib(int n) {
        // dp解法
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[2];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int sum = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = sum;
        }

        return dp[1];
    }

    // 递归解法
//    public int fib(int n) {
//        if (n < 2) {
//            return n;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }
}
