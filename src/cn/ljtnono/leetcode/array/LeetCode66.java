package cn.ljtnono.leetcode.array;

import java.util.Arrays;

/**
 * LeetCode66
 *
 * @author Ling, Jiatong
 * Date: 2023/5/18 16:38
 */
public class LeetCode66 {

    /**
     * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
     * <p>
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     * <p>
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     * <p>
     * 示例：1
     * <p>
     * 输入：digits = [1,2,3]
     * 输出：[1,2,4]
     * 解释：输入数组表示数字 123。
     * 示例2：
     * <p>
     * 输入：digits = [4,3,2,1]
     * 输出：[4,3,2,2]
     * 解释：输入数组表示数字 4321。
     * 示例 3：
     * <p>
     * 输入：digits = [0]
     * 输出：[1]
     * <p>
     * 提示：
     * <p>
     * 1 <= digits.length <= 100
     * 0 <= digits[i] <= 9
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/plus-one
     *
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        if (digits.length == 1) {
            if (digits[0] != 9) {
                digits[0] = digits[0] + 1;
                return digits;
            } else {
                return new int[]{1, 0};
            }
        }
        int i = digits.length - 1;
        if (digits[i] < 9) {
            digits[i] = digits[i] + 1;
            return digits;
        } else {
            int j = i;
            while (j > 0) {
                if (digits[j] == 9) {
                    digits[j] = 0;
                    j--;
                } else {
                    digits[j] = digits[j] + 1;
                    break;
                }
            }
            if (j == 0) {
                if (digits[0] == 9) {
                    digits[0] = 0;
                    // 往数组首位加一个元素1
                    int[] result = new int[digits.length + 1];
                    result[0] = 1;
                    for (int s = 1; s < result.length; s++) {
                        result[s] = digits[s - 1];
                    }
                    return result;
                } else {
                    digits[0] = digits[0] + 1;
                }
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
