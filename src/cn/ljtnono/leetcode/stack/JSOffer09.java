package cn.ljtnono.leetcode.stack;

import java.util.Stack;

/**
 * 剑指Offer09
 *
 * @author Ling, Jiatong
 * Date: 2023/7/29 16:20
 */
public class JSOffer09 {


    /**
     *     用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
     *     分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead操作返回 -1 )
     *
     *     示例 1：
     *
     *     输入：
     *             ["CQueue","appendTail","deleteHead","deleteHead","deleteHead"]
     *             [[],[3],[],[],[]]
     *     输出：[null,null,3,-1,-1]
     *     示例 2：
     *
     *     输入：
     *             ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
     *             [[],[],[5],[2],[],[]]
     *     输出：[null,-1,null,null,5,2]
     *     提示：
     *
     *             1 <= values <= 10000
     *     最多会对 appendTail、deleteHead 进行 10000 次调用
     *
     *     作者：Krahets
     *     链接：https://leetcode.cn/leetbook/read/illustration-of-algorithm/5d3i87/
     *     来源：力扣（LeetCode）
     *     著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     */
    public static final class CQueue {

        private Stack<Integer> stack = new Stack<>();

        public CQueue() {

        }

        public void appendTail(int value) {
            stack.push(value);
        }

        public int deleteHead() {
            if (stack.size() == 0) {
                return -1;
            }
            Stack<Integer> tmpStack = new Stack<>();
            int stackSize = stack.size();
            for (int i = 0; i < stackSize; i++) {
                tmpStack.push(stack.pop());
            }
            int result = tmpStack.pop();
            int tmpStackSize = tmpStack.size();
            for (int i = 0; i < tmpStackSize; i++) {
                stack.push(tmpStack.pop());
            }
            return result;
        }
    }



}
