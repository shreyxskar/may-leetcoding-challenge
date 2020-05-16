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
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        ListNode odd = head, even = head.next, evenFirst = even;
        while(true){
            if(odd == null || even.next == null || even == null){
                odd.next = evenFirst;
                break;
            }
            odd.next = even.next;
            odd = even.next;
            if(odd.next == null){
                even.next = null;
                odd.next = evenFirst;
                break;
            }
            even.next = odd.next;
            even = odd.next;
        }
        return head;
    }
}
