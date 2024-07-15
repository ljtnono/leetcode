package cn.ljtnono.leetcode.hash;

import java.util.*;
import java.util.stream.Collectors;

/**
 * LeetCode #349
 *
 * @author Ling, Jiatong
 * Date: 2024/7/15 下午2:47
 */
public class LeetCode349 {

    /**
     * 给定两个数组 nums1 和 nums2 ，返回 它们的
     * 交集
     *  。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
     *
     *
     *
     * 示例 1：
     *
     * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
     * 输出：[2]
     * 示例 2：
     *
     * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * 输出：[9,4]
     * 解释：[4,9] 也是可通过的
     *
     *
     * 提示：
     *
     * 1 <= nums1.length, nums2.length <= 1000
     * 0 <= nums1[i], nums2[i] <= 1000
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < nums1.length; i++) {
            int n1 = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                int n2 = nums2[j];
                if (n2 == n1) {
                    treeSet.add(n1);
                }
            }
        }
        int[] result = new int[treeSet.size()];
        Iterator<Integer> iterator = treeSet.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            result[i] = iterator.next();
            i++;
        }
        return result;
    }

}
