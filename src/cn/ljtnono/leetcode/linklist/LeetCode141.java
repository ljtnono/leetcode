package cn.ljtnono.leetcode.linklist;

/**
 * LeetCode #141
 *
 * @author Ling, Jiatong
 * Date: 2024/7/11 下午10:03
 */
public class LeetCode141 {


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

    }


    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }



}