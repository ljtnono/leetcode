package cn.ljtnono.leetcode.string;

/**
 * LeetCode #5
 *
 * @author Ling, Jiatong
 * Date: 2022/4/4 14:24
 */
public class LeetCode5 {


    /**
     * 给你一个字符串 s，找到 s 中最长的回文子串。
     *
     * 示例 1：
     *
     * 输入：s = "babad"
     * 输出："bab"
     * 解释："aba" 同样是符合题意的答案。
     * 示例 2：
     *
     * 输入：s = "cbbd"
     * 输出："bb"
     *
     * 提示：
     *
     * 1 <= s.length <= 1000
     * s 仅由数字和英文字母组成
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static String longestPalindrome(String s) {
        if (s.length() == 1 || (s.length() == 2 && s.charAt(0) == s.charAt(1))) {
            return s;
        }
        // 最长回文子串长度
        int maxLength = 1;
        // 最长子串的起始索引
        int startIndex = 0;
        int left = 0;
        int right = 0;


        for (int i = 0; i < s.length(); i++) {
            int subStrLength = 1;
            left = i - 1;
            right = i + 1;
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                left--;
                subStrLength++;
            }
            while (right <= s.length() - 1 && s.charAt(right) == s.charAt(i)) {
                right++;
                subStrLength++;
            }
            while (right <= s.length() - 1 && left >= 0 && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
                subStrLength += 2;
            }
            if (subStrLength > maxLength) {
                maxLength = subStrLength;
                startIndex = left;
            }
        }

        return s.substring(startIndex + 1, startIndex + maxLength + 1);
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("cbbd"));
    }

}
