package cn.ljtnono.leetcode.string;

/**
 * LeetCode 345
 *
 * @author Ling, Jiatong
 * Date: 2022/4/4 19:29
 */
public class LeetCode345 {

    /**
     * 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
     *
     * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现。
     *
     * 示例 1：
     *
     * 输入：s = "hello"
     * 输出："holle"
     * 示例 2：
     *
     * 输入：s = "leetcode"
     * 输出："leotcede"
     * 提示：
     *
     * 1 <= s.length <= 3 * 105
     * s 由 可打印的 ASCII 字符组成
     *
     * 作者：力扣 (LeetCode)
     * 链接：https://leetcode-cn.com/leetbook/read/all-about-array/x93lce/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param s
     * @return
     */
    public String reverseVowels(String s) {
        if (s.length() == 1) {
            return s;
        }

        char[] c = s.toCharArray();

        int i = 0, j = c.length - 1;
        while (i < j) {
            if (!isVowel(c[i])) {
                i++;
                continue;
            }
            if (!isVowel(c[j])) {
                j--;
                continue;
            }

            if (isVowel(c[i]) && isVowel(c[j])) {
                // 交换两个位置
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
        }

        return String.valueOf(c);
    }

    public boolean isVowel(char s) {
        char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < vowels.length; i++) {
            if (s == vowels[i]) {
                return true;
            }
        }
        return false;
    }




}
