public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        if(head==null)
        	return null;
        if(n<=0)
        	return head;
       	ListNode tmp = head;
       	ListNode result = head;
       	for(int i=0; i<n; i++)
       		tmp = tmp.next;
       	ListNode preNode = head;
       	while(tmp!=null){
       		tmp = tmp.next;
       		preNode = head;
       		head = head.next;
       	}
       	if(head.next==null){
       		if(head==preNode)
       			result = null;
       		else 
       			preNode.next = null;
       	}
       	else{
       		head.val = head.next.val;
       		head.next = head.next.next;
       	}
       	return result;
    }
}
