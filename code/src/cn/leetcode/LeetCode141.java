package cn.leetcode;

/**
 * @author 王山鹏 (shanpeng.wang@transsion.com)
 * @since 2021-12-15
 */
public class LeetCode141 {


    public static void main(String[] args) {
        
        ListNode l = new ListNode();
        l.next = new ListNode(1);
        l.next.next = new ListNode(2);
        l.next.next.next = new ListNode(3);
        l.next.next.next.next = new ListNode(4);
        l.next.next.next.next = l.next;
        System.out.println(hasCycle(l));
    }
    public static boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) {
            return false;
        }
        ListNode low=head;
        ListNode fast=head;
        while( fast!=null && fast.next!=null){
            low=low.next;
            fast=fast.next.next;
            if(low==fast) {
                return true;
            }
        }
        return false;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
