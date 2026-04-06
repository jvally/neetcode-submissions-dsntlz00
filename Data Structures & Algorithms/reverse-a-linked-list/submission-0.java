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
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null){//while not end pointer
            ListNode temp = curr.next;//move to next node
            curr.next = prev;//make current node point to previous node
            prev = curr;//change previous node to current head
            curr = temp;// shift current head to next node
        }

        return prev;//which is current head

    }
}
