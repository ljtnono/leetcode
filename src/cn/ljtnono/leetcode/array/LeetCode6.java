package cn.ljtnono.leetcode.array;

/**
 * LeetCode6
 *
 * @author Ling, Jiatong
 * Date: 2023/3/10 15:03
 */
public class LeetCode6 {


    /**
     * 6.N字形变换
     * <p>
     * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行N 字形排列。
     * <p>
     * 比如输入字符串为 "PAYPALISHIRING"行数为 3 时，排列如下：
     * <p>
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * <p>
     * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
     * <p>
     * 请你实现这个将字符串进行指定行数变换的函数：
     * string convert(string s, int numRows);
     * <p>
     * 示例 1：
     * 输入：s = "PAYPALISHIRING", numRows = 3
     * 输出："PAHNAPLSIIGYIR"
     * <p>
     * 示例 2：
     * <p>
     * 输入：s = "PAYPALISHIRING", numRows = 4
     * 输出："PINALSIGYAHRPI"
     * 解释：
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     * <p>
     * 示例 3：
     * <p>
     * 输入：s = "A", numRows = 1
     * 输出："A"
     * <p>
     * 提示：
     * <p>
     * 1 <= s.length <= 1000
     * s 由英文字母（小写和大写）、',' 和 '.' 组成
     * 1 <= numRows <= 1000
     *
     * @param s
     * @param numRows
     * @return
     */
    public static String convert(String s, int numRows) {
        String[] str = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            str[i] = "";
        }
        int p = 0, n = s.length();
        while (p < n) {
            for (int i = 0; i < numRows && p < n; i++) {
                str[i] += s.charAt(p++);
            }
            for (int i = numRows - 2; i >= 1 && p < n; i--) {
                str[i] += s.charAt(p++);
            }
        }
        String ans = "";
        for (int i = 0; i < numRows; i++) {
            ans += str[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        convert("PAYPALISHIRING", 3);
    }
}
