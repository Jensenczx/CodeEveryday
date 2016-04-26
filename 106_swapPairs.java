/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * @param head a ListNode
     * @return a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        // Write your code here
        ListNode dumyNode = new ListNode(0);
        dumyNode.next = head;
        ListNode tmpNode = dumyNode;
        while(tmpNode.next!=null){
        	ListNode tmp = tmpNode.next;
        	if(tmp.next!=null){
        		ListNode node = tmp.next;
        		tmp.next = node.next;
        		node.next = tmp;
        		tmpNode.next = node;
        	}
        	tmpNode =  tmp;
        }
        return dumyNode.next;
    }
}