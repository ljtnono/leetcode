package cn.ljtnono.leetcode.twopointer;

/**
 * LeetCode #19
 *
 * @author Ling, Jiatong
 * Date: 2022/4/3 14:51
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
        // 先遍历链表，获取长度
        ListNode node = head;
        int size = 1;
        while (node.next != null) {
            node = node.next;
            size++;
        }
        // 判断如果删除的是头节点
        if (n == 1 && size == 1) {
            return head.next;
        }
        node = head;
        int i = 1;
        int deleteIndex = size - n + 1;
        ListNode pre = head;
        if (deleteIndex == 1) {
            return head.next;
        }
        // 再遍历链表
        while (node != null) {
            if (deleteIndex == i) {
                // 遍历到需要删除的节点了，删除当前节点
                pre.next = node.next;
                break;
            }
            pre = node;
            node = node.next;
            i++;
        }
        return head;
    }

}
