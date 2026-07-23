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

        ListNode currNode = head;
        ListNode prev = null;

        while(currNode != null){
            
            ListNode tempNode = currNode.next;
            
            //change the reference of current node to previous node so we can reverse it
            currNode.next = prev;
            
            //update the prev
            prev = currNode;

            //update the head
            currNode = tempNode;

        }

        return prev;

    }
}
