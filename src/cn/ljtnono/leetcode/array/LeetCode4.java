package cn.ljtnono.leetcode.array;

import java.util.Arrays;

/**
 * LeetCode #4
 *
 * @author Ling, Jiatong
 * Date: 2022/4/3 22:49
 */
public class LeetCode4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, num, 0, nums1.length);
        System.arraycopy(nums2, 0, num, nums1.length, nums2.length);
        Arrays.sort(num);
        if (num.length % 2 == 0) {
            return (num[num.length / 2]  + num[num.length / 2 - 1]) * 1.0 / 2;
        } else {
            return num[num.length / 2];
        }
    }

}
