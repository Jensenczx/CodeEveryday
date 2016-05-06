/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) { 
        // write your code here
        if(head==null||head.next==null)
        	return null;
        ListNode node = head;
        while(node.next!=null){
        	if(node.next.val==node.val)
        		node.next = node.next.next;
        	else node = node.next;
        	if(node==null)
        		break;
        }
        return head;
    }  
}