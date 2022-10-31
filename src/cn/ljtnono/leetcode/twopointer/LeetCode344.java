package cn.ljtnono.leetcode.twopointer;

/**
 * LeetCode #344
 *
 * @author Ling, Jiatong
 * Date: 2022/4/2 00:06
 */
public class LeetCode344 {

    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
