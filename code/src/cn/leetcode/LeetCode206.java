package cn.leetcode;

/**
 * 206.链表反转
 *  使用代码的方式遍历ListNode结点
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-14
 */
public class LeetCode206 {


    public static void main(String[] args) {
        ListNode l = new ListNode();
        l.next = new ListNode(1);
        l.next.next = new ListNode(2);
        l.next.next.next = new ListNode(3);
        l.next.next.next.next = new ListNode(4);
        System.out.println(reverseList(l));
    }

    public static ListNode reverseList(ListNode head) {
        //新的返回链表
        ListNode res = null;
        //定义指针结点
        ListNode listNode = head;
        while(listNode != null){
            //临时结点，当前结点的后一个结点
            ListNode temp = listNode.next;
            //当前结点指向返回链表的头结点
            listNode.next = res;
            //返回结果的结点
            res = listNode;
            //当前指针后移
            listNode = temp;
        }

        return res;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
