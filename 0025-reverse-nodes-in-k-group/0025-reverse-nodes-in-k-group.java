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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return null;
        ListNode check = head;
        int count = 0;
        while (check != null && count < k) {
            check = check.next;
            count++;
        }
        if (count < k) return head;
        ListNode cur = head;
        ListNode prev = null;
        ListNode next = null;
        count = 0;
        while(cur != null && count < k){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            count++;
        }
        if(next != null){
            head.next = reverseKGroup(next,k);
        }
        return prev;
    }
}