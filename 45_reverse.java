public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
         if(head==null)
        	return null;
        ListNode tmpNode=null;
        ListNode lastNode=null;
        while(head.next!=null){
            tmpNode = head;
            head = head.next;
        	tmpNode.next = lastNode;
        	lastNode = tmpNode;
        }
        head.next = lastNode;
        return head;
    }
}