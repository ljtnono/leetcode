package cn.ljtnono.leetcode.sliderwindow;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode #3
 *
 * @author Ling, Jiatong
 * Date: 2022/4/3 18:36
 */
public class LeetCode3 {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }
        int i = 0;
        int j = 1;
        int max = 1;
        while (j < s.length()) {
            if (duplicateChar(s.substring(i, j + 1))) {
                i++;
                j = i + 1;
            } else {
                j++;
                if (j - i > max) {
                    max = j - i;
                }
            }
        }
        return max;
    }


    public boolean duplicateChar(String s) {
        if (s.length() == 1) {
            return false;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size() != s.length();
    }
}
