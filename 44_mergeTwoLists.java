public class Solution {
    /**
     * @param ListNode l1 is the head of the linked list
     * @param ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode head = null;
 		ListNode tmp = null;
 		ListNode node = null;
        while(true){
        	if(l1==null||l2==null)
        		break;
        	else if(l1.val<l2.val){
        		node = new ListNode(l1.val);
        		l1 = l1.next;
        	}else{
        		node = new ListNode(l2.val);
        		l2 = l2.next;
        	}
        	if(head==null){
        		head = node;
        		tmp = head;
        	}
        	else{
        		tmp.next = node;
        		tmp = tmp.next;
        	}
        }
        if(l1!=null){
        	if(tmp==null)
        		head = l1;
        	else 
        		tmp.next = l1;
        }
        else if(l2!=null){
        	if(tmp==null)
        		head = l2;
        	else 
        		tmp.next = l2;
        }
        return head;

    }
}