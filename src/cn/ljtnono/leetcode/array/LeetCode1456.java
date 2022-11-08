package cn.ljtnono.leetcode.array;

import java.util.Arrays;
import java.util.List;

/**
 * LeetCode1456
 *
 * @author Ling, Jiatong
 * Date: 2022/11/9 01:16
 */
public class LeetCode1456 {

    /**
     * 给你字符串 s 和整数 k 。
     *
     * 请返回字符串 s 中长度为 k 的单个子字符串中可能包含的最大元音字母数。
     *
     * 英文中的 元音字母 为（a, e, i, o, u）。
     *
     * 示例 1：
     *
     * 输入：s = "abciiidef", k = 3
     * 输出：3
     * 解释：子字符串 "iii" 包含 3 个元音字母。
     *
     * 示例 2：
     *
     * 输入：s = "aeiou", k = 2
     * 输出：2
     * 解释：任意长度为 2 的子字符串都包含 2 个元音字母。
     *
     * 示例 3：
     *
     * 输入：s = "leetcode", k = 3
     * 输出：2
     * 解释："lee"、"eet" 和 "ode" 都包含 2 个元音字母。
     *
     * 示例 4：
     *
     * 输入：s = "rhythms", k = 4
     * 输出：0
     * 解释：字符串 s 中不含任何元音字母。
     *
     * 示例 5：
     *
     * 输入：s = "tryhard", k = 4
     * 输出：1
     *
     * 提示：
     *
     * 1 <= s.length <= 10^5
     * s 由小写英文字母组成
     * 1 <= k <= s.length
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/maximum-number-of-vowels-in-a-substring-of-given-length
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *
     * @param s
     * @param k
     * @return
     */
    public int maxVowels(String s, int k) {
        // 思路：窗口大小一定，计算窗口内元音字母最多的子串
        char[] arr = s.toCharArray();
        List<Character> targetList = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int maxSum = 0;
        int currentMaxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                currentMaxSum += targetList.contains(arr[i]) ? 1 : 0;
            } else {
                if (targetList.contains(arr[i])) {
                    currentMaxSum++;
                }
                if (targetList.contains(arr[i - k])) {
                    currentMaxSum--;
                }
            }
            maxSum = Math.max(currentMaxSum, maxSum);
        }
        return maxSum;
    }
}
