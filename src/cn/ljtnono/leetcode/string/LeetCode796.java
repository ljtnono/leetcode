package cn.ljtnono.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #796
 *
 * @author Ling, Jiatong
 * Date: 2022/4/14 12:29
 */
public class LeetCode796 {


    /**
     * 给定两个字符串, s和goal。如果在若干次旋转操作之后，s能变成goal那么返回true
     *
     * s的 旋转操作 就是将s 最左边的字符移动到最右边。
     *
     * 例如, 若s = 'abcde'，在旋转一次之后结果就是'bcdea'。
     *
     *
     * 示例 1:
     *
     * 输入: s = "abcde", goal = "cdeab"
     * 输出: true
     * 示例 2:
     *
     * 输入: s = "abcde", goal = "abced"
     * 输出: false
     *
     *
     * 提示:
     *
     * 1 <= s.length, goal.length <= 100
     * s和goal由小写英文字母组成
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/rotate-string
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param s
     * @param goal
     * @return
     */
    public boolean rotateString(String s, String goal) {
        // 思路：将字符串旋转，然后对比goal
        if (s.length() == 1) {
            return true;
        }

        if (s.length() != goal.length()) {
            return false;
        }

        String temp = s;
        int i = 0;
        while (i < s.length()) {
            System.out.println("temp = " + temp);
            if (temp.equalsIgnoreCase(goal)) {
                return true;
            }
            temp = cicle(temp);
            i++;
        }

        return false;
    }


    public String cicle(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s.substring(1));
        stringBuilder.append(s.charAt(0));
        return stringBuilder.toString();
    }

}
