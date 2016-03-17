public class Solution {
    /**
     * @param headA: the first list
     * @param headB: the second list
     * @return: a ListNode 
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Write your code here
        if(headA==null||headB==null){
        	return null;
        }
        int lenA = 0;
        int lenB = 0;
        ListNode tmpNode = headA;
        while(tmpNode.next!=null){
        	lenA++;
        	tmpNode = tmpNode.next;
        }
        tmpNode = headB;
        while(tmpNode.next!=null){
        	lenB++;
        	tmpNode = tmpNode.next;
        }
        int tmp = lenA-lenB;
        int dis = Math.abs(tmp);
        ListNode node=null;
        if(tmp<0){
        	tmpNode = headB;
        	node = headA;
        }else{
        	tmpNode = headA;
        	node = headB;
        }
        while(tmpNode.next!=null){
        	if(dis--<=0){
        		if(tmpNode==node)
        			return node;
        		node = node.next;
        	}
        	tmpNode = tmpNode.next;
        }
        if(tmpNode==node)
        	return node;
        return null;
    }  
}