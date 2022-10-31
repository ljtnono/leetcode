package cn.ljtnono.leetcode.twopointer;

/**
 * LeetCode #28
 *
 * @author Ling, Jiatong
 * Date: 2022/4/3 22:31
 */
public class LeetCode28 {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int i = 0;
        int j = needle.length() - 1;
        while (j < haystack.length()) {
            if (haystack.charAt(i) != needle.charAt(0)) {
                i++;
                j++;
            } else {
                if (haystack.substring(i, j + 1).equals(needle)) {
                    return i;
                } else {
                    i++;
                    j++;
                }
            }
        }
        return -1;
    }
}
