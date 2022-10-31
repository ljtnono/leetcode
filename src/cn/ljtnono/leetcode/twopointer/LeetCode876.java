package cn.ljtnono.leetcode.twopointer;

/**
 * LeetCode #876
 *
 * @author Ling, Jiatong
 * Date: 2022/4/3 18:26
 */
public class LeetCode876 {

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

    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        int size = 1;
        while (node.next != null) {
            node = node.next;
            size++;
        }
        int middle = (size / 2) + 1;

        node = head;
        int index = 1;
        while (node.next != null) {
            if (index == middle) {
                return node;
            }
            index++;
            node = node.next;
        }
        return node;
    }

}
