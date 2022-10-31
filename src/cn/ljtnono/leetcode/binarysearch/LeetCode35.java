package cn.ljtnono.leetcode.binarysearch;

/**
 * LeetCode #35
 *
 * @author Ling, Jiatong
 * Date: 2022/4/1 22:53
 */
public class LeetCode35 {


    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, target, 0, nums.length - 1);
    }

    public int searchInsert(int[] nums, int target, int startPos, int endPos) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (startPos == endPos) {
            if (nums[startPos] == target) {
                return startPos;
            } else {
                return startPos + 1;
            }
        }
        int middle = (startPos + endPos) / 2;
        if (nums[middle] > target) {
            return searchInsert(nums, target, middle + 1, endPos);
        } else {
            return searchInsert(nums, target, startPos, middle);
        }
    }


}
