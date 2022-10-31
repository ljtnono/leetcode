package cn.ljtnono.leetcode.twopointer;

/**
 * LeetCode #167
 *
 * @author Ling, Jiatong
 * Date: 2022/4/3 18:03
 */
public class LeetCode167 {


    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[] {i + 1, j + 1};
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
}
