package cn.ljtnono.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #454
 *
 * @author Ling, Jiatong
 * Date: 2024/7/15 下午5:18
 */
public class LeetCode454 {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums1) {
            for (int b : nums2) {
                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
            }
        }
        int res = 0;
        for (int a : nums3) {
            for (int b : nums4) {
                if (map.containsKey(-a - b)) {
                    res += map.get(-a - b);
                }
            }
        }
        return res;
    }
}
