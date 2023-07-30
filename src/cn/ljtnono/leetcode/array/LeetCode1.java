package cn.ljtnono.leetcode.array;

import java.util.HashMap;

/**
 * @author Ling, Jiatong
 * Date: 2022/9/1 12:02
 */
public class LeetCode1 {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = i;
                result[1] = map.get(nums[i]);
            }
        }
        return result;
    }

}
