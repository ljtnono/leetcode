package cn.ljtnono.leetcode.linklist;

import java.util.Stack;

/**
 * LeetCode #234
 *
 * @author Ling, Jiatong
 * Date: 2022/4/14 11:49
 */
public class LeetCode234 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        /**
         *
         * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
         *
         *
         *
         * 示例 1：
         *
         *
         * 输入：head = [1,2,2,1]
         * 输出：true
         * 示例 2：
         *
         *
         * 输入：head = [1,2]
         * 输出：false
         *
         *
         * 提示：
         *
         * 链表中节点数目在范围[1, 105] 内
         * 0 <= Node.val <= 9
         *
         *
         * 进阶：你能否用O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
         *
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode-cn.com/problems/palindrome-linked-list
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         *
         * @param head
         * @return
         */
        public boolean isPalindrome(ListNode head) {
            // 思路，先遍历一遍,放入栈中，然后
            if (head == null) {
                return false;
            }
            Stack<Integer> stack = new Stack<>();
            ListNode node = head;
            while (node.next != null) {
                node = node.next;
                stack.push(node.val);
            }

            while (head.next != null) {
                if (head.val != stack.pop()) {
                    return false;
                }
                head = head.next;
            }
            return true;
        }
    }
}
