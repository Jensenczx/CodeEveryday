public class Solution {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode dummy = new ListNode(0);
        if(l1==null&&l2==null)
        	return dummy.next;
        int pre = 0;
        ListNode node = dummy;
        while(l1!=null&&l2!=null){
        	int sum = l1.val+l2.val+pre;
        	ListNode tmp = new ListNode(sum%10);
        	pre = sum/10;
        	node.next = tmp;
        	node = node.next;
        	l1 = l1.next;
        	l2 = l2.next;
        }
        while(l1!=null){
        	int sum = l1.val+pre;
        	ListNode tmp = new ListNode(sum%10);
        	pre = sum/10;
        	node.next = tmp;
        	node = node.next;
        	l1 = l1.next;
        }
        while(l2!=null){
        	int sum = l2.val+pre;
        	ListNode tmp = new ListNode(sum%10);
        	pre = sum/10;
        	node.next = tmp;
        	node = node.next;
        	l2 = l2.next;
        }
        if(pre!=0){
        	ListNode tmp = new ListNode(pre);
        	node.next = tmp;
        }
        return dummy.next;
       
    }
}