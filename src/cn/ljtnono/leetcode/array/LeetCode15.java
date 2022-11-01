package cn.ljtnono.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * LeetCode15
 *
 * @author Ling, Jiatong
 * Date: 2022/10/31 23:06
 */
public class LeetCode15 {

    /**
     * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
     * <p>
     * 你返回所有和为 0 且不重复的三元组。
     * <p>
     * 注意：答案中不可以包含重复的三元组。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/3sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * <p>
     * 思路：
     * 采用双指针法
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        int left;
        int right;
        List<List<Integer>> result = new ArrayList<>();
        // 先排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // 已经排序过了，如果第一个元素大于0，那么就不可能有符合条件的三元组
            if (nums[i] > 0) {
                break;
            }
            // 如果当前元素已经遍历过，跳过一个相同的元素
            if (i > 0 && (nums[i] == nums[i - 1])) {
                continue;
            }
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                int s = nums[i] + nums[left] + nums[right];
                if (s == 0) {
                    // 判断是否已经加入过
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    right--;
                    left++;
                } else if (s > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

}
