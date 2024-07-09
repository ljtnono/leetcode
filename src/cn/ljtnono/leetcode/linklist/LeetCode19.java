package cn.ljtnono.leetcode.linklist;

/**
 * LeetCode #19
 *
 * @author Ling, Jiatong
 * Date: 2024/7/9 下午11:44
 */
public class LeetCode19 {

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


    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 1 && head.next == null) {
            return head.next;
        }
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode fast = dummyNode;
        ListNode slow = dummyNode;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // 删除节点
        slow.next = slow.next.next;
        return dummyNode.next;
    }

}
