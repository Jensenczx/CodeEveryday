class RandomListNode {
     int label;
     RandomListNode next, random;
     RandomListNode(int x) { this.label = x; }
  };
public class Solution {
    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
        if(head==null)
        	return null;
        RandomListNode tmp = head;
        //节点复制
        while(tmp.next!=null){
        	RandomListNode node = tmp.next;
        	RandomListNode node1 = new RandomListNode(tmp.label);
        	tmp.next = node1;
        	node1.next = node;
        	tmp = node;
        }
        tmp.next = new RandomListNode(tmp.label);
        tmp = head;
        //随机节点复制
        while(tmp.next!=null){
        	tmp.next.random = tmp.random;
        	tmp = tmp.next.next;
        	if(tmp==null)
        		break;
        }
        //节点链拆分
        tmp = head;
        RandomListNode result = tmp.next;
        RandomListNode travelNode = result;
        tmp.next = travelNode.next;
        tmp = tmp.next;
        while(tmp!=null){
        	travelNode.next = tmp.next;
        	travelNode = travelNode.next;
        	tmp.next= travelNode.next;
        	tmp = tmp.next;
        }
        return result;
    }
}