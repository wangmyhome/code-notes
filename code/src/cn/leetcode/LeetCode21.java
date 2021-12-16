package cn.leetcode;

/**
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-16
 */
public class LeetCode21 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(3);
        l1.next.next.next.next = new ListNode(10);
        ListNode l2 = new ListNode();
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(6);
        l2.next.next.next = new ListNode(8);
        l2.next.next.next.next = new ListNode(11);
        System.out.println(mergeTwoLists(l1,l2));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 类似归并排序中的合并过程
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        // 任一为空，直接连接另一条链表
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        return dummyHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
