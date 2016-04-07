public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param x: an integer
     * @return: a ListNode 
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if(head==null)
        	return null;
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode startNode = dummyNode;
        ListNode node = dummyNode;
        boolean isFirst = true;
        while(node.next!=null){
        	ListNode tmp = node;
        	node = node.next;
        	if(node.val>=x){
        		if(isFirst){
        			startNode = tmp;
        			isFirst = false;
        		}
        	}else{
        		if(!isFirst){
        			tmp.next = node.next;
        			convertNode(startNode,node);
        			startNode = node;
        			node = tmp;
        			if(node==null)
        				break;
        		}
        	}
        }
        return dummyNode.next;
    }

    public void convertNode(ListNode startNode,ListNode nowNode){
    	ListNode tmp = startNode.next;
    	startNode.next = nowNode;
    	nowNode.next = tmp;
    }
}
