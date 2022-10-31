package cn.ljtnono.leetcode.linklist;

/**
 * LeetCode #21
 *
 * @author Ling, Jiatong
 * Date: 2022/4/4 15:46
 */
public class LeetCode21 {


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


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode result = new ListNode();
        ListNode r = result;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                r.next = new ListNode(p1.val);
                p1 = p1.next;
            } else if (p1.val == p2.val) {
                r.next = new ListNode(p1.val);
                r.next.next = new ListNode(p2.val);
                p1 = p1.next;
                p2 = p2.next;
                r = r.next;
            } else {
                r.next = new ListNode(p2.val);
                p2 = p2.next;
            }
            r = r.next;
        }

        while (p1 != null) {
            r.next = new ListNode(p1.val);
            p1 = p1.next;
            r = r.next;
        }

        while (p2 != null) {
            r.next = new ListNode(p2.val);
            p2 = p2.next;
            r = r.next;
        }

        return result.next;
    }

}
