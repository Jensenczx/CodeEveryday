public class ListNode {
     int val;
     ListNode next;
     ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    /**
     * @param node: the node in the list should be deleted
     * @return: nothing
     */
    public void deleteNode(ListNode node) {
        // write your code here
        if(node==null)
        	return;
        if(node.next==null)
        	node = null;
        else if(node.next!=null){
        	node.val = node.next.val;
        	node.next = node.next.next;
    }
}
}