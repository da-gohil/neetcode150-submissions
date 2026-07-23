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
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null) return;
        
        //head of first half
        ListNode l1 = head;

        //head of second half
        ListNode slow = head;
        
        //Tail of seconf half
        ListNode fast = head;

        //Tail of first half
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        ListNode l2 = reverse(slow);
        merge(l1, l2);

    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode newNode = current.next;
            current.next = prev;
            prev = current;
            current = newNode;
        }
        return prev;
    }

    public void merge(ListNode l1, ListNode l2){
        while(l1 != null){

            ListNode l1_next = l1.next;
            ListNode l2_next = l2.next;
            
            l1.next = l2;
            
            if(l1_next == null){
                break;
            }
            l2.next = l1_next;

            l1 = l1_next;
            l2 = l2_next;
        }
    }
}

// 1- 2 - 3- 4-
//seprate the linkedlist
// 5- 6- 7- 8;

//reverse the second half 

//merge one from first and one from other end;

// 1- 8- 2- 7- 3- 6- 4- 5;

