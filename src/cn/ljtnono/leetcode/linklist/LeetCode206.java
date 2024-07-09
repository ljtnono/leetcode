package cn.ljtnono.leetcode.linklist;

/**
 * LeetCode #206
 *
 * @author Ling, Jiatong
 * Date: 2022/4/4 15:46
 */
public class LeetCode206 {

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
    }


    public ListNode reverseList(ListNode head) {
        // 双指针法
        ListNode tmp = null;
        ListNode current = head;
        ListNode pre = null;
        while (current != null) {
            tmp = current.next;
            current.next = pre;
            pre = current;
            current = tmp;
        }
        return pre;
    }


    public ListNode reverse(ListNode pre, ListNode current) {
        // 递归法
        if (current == null) {
            return pre;
        }
        ListNode tmp = current.next;
        current.next = pre;
        pre = current;
        current = tmp;
        return reverse(pre, current);
    }

}
