package cn.ljtnono.leetcode.binarysearch;

/**
 * LeetCode #278
 *
 * @author Ling, Jiatong
 * Date: 2022/4/1 21:45
 */
public class LeetCode278 {


    public boolean isBadVersion(int version) {
        return true;
    }

    /**
     * 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
     *
     * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
     *
     * 你可以通过调用bool isBadVersion(version)接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/first-bad-version
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param n
     * @return
     */
    public int firstBadVersion(int n) {
        return firstBadVersion(1, n);
    }

    public int firstBadVersion(int startPos, int endPos) {
        if (startPos == endPos) {
            if (isBadVersion(startPos)) {
                return startPos;
            }
        }
        int middle = startPos + (endPos - startPos) / 2;
        if (!isBadVersion(middle)) {
            return firstBadVersion( middle + 1, endPos);
        } else {
            return firstBadVersion(startPos, middle);
        }
    }
}
