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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0 , head);
        ListNode ptr1 = dummy;
        ListNode ptr2 = head;
        while (n != 0){//setting up the 2 pointers
            ptr2 = ptr2.next;
            n--;
        }
        while(ptr2 != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
    
        ptr1.next = ptr1.next.next;
        return dummy.next;
    }
}
