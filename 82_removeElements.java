public class Solution {
    /**
     * @param head a ListNode
     * @param val an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // Write your code here
        if(head==null)
        	return null;
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode node = dummyNode;
        while(node.next!=null){
        	if(node.next.val==val){
        		node.next = node.next.next;
        	}else{
        		node = node.next;
        	}
        }
        return dummyNode.next;
    }
}