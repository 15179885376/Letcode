/**
 * @author Zzy
 * @create 2019  06  20:15
 * @desc
 **/
//*
// 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
//你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
//
//示例:
//给定 1->2->3->4, 你应该返回 2->1->4->3.
//
//说明:
//
//你的算法只能使用常数的额外空间。
//你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
//解题思路
// */
public class Letcode_24 {
    public static void main(String[] args) {

    }
    public static ListNode test(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode root=new ListNode(0);
        root.next=head;
        ListNode pre=root;
        while(pre.next!=null && pre.next.next!=null){
            ListNode node1=pre.next;
            ListNode node2=pre.next.next;
            pre.next=node2;
            node1.next=node2.next;
            node2.next=node1;
            pre=node1;
        }
        return root.next;
    }
}
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
