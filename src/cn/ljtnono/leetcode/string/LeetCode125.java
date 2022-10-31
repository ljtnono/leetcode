package cn.ljtnono.leetcode.string;

import java.util.Locale;

/**
 * LeetCode #125
 *
 * @author Ling, Jiatong
 * Date: 2022/4/4 19:14
 */
public class LeetCode125 {


    public boolean isPalindrome(String s) {
        s = s.replaceAll(" ", "").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

}
