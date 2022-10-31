package cn.ljtnono.leetcode.array;

/**
 * LeetCode #215
 *
 * @author Ling, Jiatong
 * Date: 2022/4/5 21:01
 */
public class LeetCode215 {

    /**
     * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
     *
     * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
     *
     * 示例 1:
     *
     * 输入: [3,2,1,5,6,4] 和 k = 2
     * 输出: 5
     * 示例2:
     *
     * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
     * 输出: 4
     *
     *
     * 提示：
     *
     * 1 <= k <= nums.length <= 104
     * -104<= nums[i] <= 104
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/kth-largest-element-in-an-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums);


        return 0;
    }


    public void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }


    public void quickSort(int[] arr, int start, int end) {
        // 将数组分区，并获得中间值的下标
        int middle = partition(arr, start, end);
        // 对左边区域快速排序
        quickSort(arr, start, middle - 1);
        // 对右边区域快速排序
        quickSort(arr, middle + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        // TODO: 将 arr 从 start 到 end 分区，左边区域比基数小，右边区域比基数大，然后返回中间值的下标
        return 1;
    }

}
