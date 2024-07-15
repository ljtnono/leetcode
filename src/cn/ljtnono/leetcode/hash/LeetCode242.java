package cn.ljtnono.leetcode.hash;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #242
 *
 * @author Ling, Jiatong
 * Date: 2024/7/15 下午2:21
 */
public class LeetCode242 {

    /**
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
     *
     * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
     *
     *
     *
     * 示例 1:
     *
     * 输入: s = "anagram", t = "nagaram"
     * 输出: true
     * 示例 2:
     *
     * 输入: s = "rat", t = "car"
     * 输出: false
     *
     *
     * 提示:
     *
     * 1 <= s.length, t.length <= 5 * 104
     * s 和 t 仅包含小写字母
     *
     *
     * 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] nums = new int[26];
        for (int i = 0; i < 26; i++) {
            nums[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            nums[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                return false;
            }
        }
        return true;
    }

//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        Map<String, Integer> sMap = new HashMap<>();
//        Map<String, Integer> tMap = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (sMap.containsKey(s.charAt(i) + "")) {
//                sMap.put(s.charAt(i) + "", sMap.get(s.charAt(i) + "") + 1);
//            } else {
//                sMap.put(s.charAt(i) + "", 1);
//            }
//            if (tMap.containsKey(t.charAt(i) + "")) {
//                tMap.put(t.charAt(i) + "", tMap.get(t.charAt(i) + "") + 1);
//            } else {
//                tMap.put(t.charAt(i) + "", 1);
//            }
//        }
//        for (String key : sMap.keySet()) {
//            if (!tMap.containsKey(key)) {
//                return false;
//            } else {
//                Integer tNum = tMap.get(key);
//                Integer sNum = sMap.get(key);
//                if (!sNum.equals(tNum)) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
}
