package cn.ljtnono.leetcode.array;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * LeetCode 65
 *
 * @author Ling, Jiatong
 * Date: 2022/11/14 09:40
 */
public class LeetCode76 {


    /**
     * 76. 最小覆盖子串
     *
     * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
     *
     * 注意：
     *
     * 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
     * 如果 s 中存在这样的子串，我们保证它是唯一的答案。
     *
     * 示例 1：
     *
     * 输入：s = "ADOBECODEBANC", t = "ABC"
     * 输出："BANC"
     *
     * 示例 2：
     *
     * 输入：s = "a", t = "a"
     * 输出："a"
     *
     * 示例 3:
     *
     * 输入: s = "a", t = "aa"
     * 输出: ""
     * 解释: t 中两个字符 'a' 均应包含在 s 的子串中，
     * 因此没有符合条件的子字符串，返回空字符串。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/minimum-window-substring
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param s
     * @param t
     * @return
     */
    public static String minWindow(String s, String t) {
        // 思路1,采用暴力解法
        if (s.equals(t)) {
            return s;
        }
        if (t.length() > s.length()) {
            return "";
        }
        String result = "";
        int minLength = s.length();
        for (int i = 0; i < s.length(); i ++) {
            for (int j = i; j < s.length(); j++) {
                if (include(s.substring(i, j + 1), t)) {
                    if (j - i + 1 <= minLength) {
                        minLength = j - i + 1;
                        result = s.substring(i, j + 1);
                    }
                }
            }
        }

        return result;
        // 思路2，采用滑动窗口
    }


    /**
     * 判断s中是否包含t中的所有字符串
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean include(String s, String t) {
        Map<Character, Integer> sourceMap = new HashMap<>();
        Map<Character, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            sourceMap.merge(c, 1, Integer::sum);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (t.indexOf(c) != -1) {
                resultMap.merge(c, 1, Integer::sum);
            }
        }

        // 对比两个map
        AtomicBoolean result = new AtomicBoolean(true);
        sourceMap.forEach((k, v) -> {
            if (!resultMap.containsKey(k)) {
                result.set(false);
            } else {
                if (resultMap.get(k) < v) {
                    result.set(false);
                }
            }
        });

        return result.get();
    }

    public static void main(String[] args) {
        System.out.println(minWindow("bbaa", "aba"));
    }

}
