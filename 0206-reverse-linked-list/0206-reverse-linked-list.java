/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curnt = head;
        ListNode next=null;
        while(curnt!=null){
          next =curnt.next;
          curnt.next=prev;
          prev=curnt;
          curnt = next;
        }
        return prev;
    }
}