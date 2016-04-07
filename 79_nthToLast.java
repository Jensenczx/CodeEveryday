public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: Nth to last node of a singly linked list. 
     */
    ListNode nthToLast(ListNode head, int n) {
        // write your code here
        if(head==null)
        	return null;
        ListNode node = head;
        int num = 0;
        while(node.next!=null){
        	if(num++==n)
        		break;
        	node = node.next;
        }
        while(node.next!=null){
        	node = node.next;
        	head = head.next;
        }
        return head;
    }
}