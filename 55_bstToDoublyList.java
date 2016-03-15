class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
  }
  class DoublyListNode {
      int val;
      DoublyListNode next, prev;
      DoublyListNode(int val) {
          this.val = val;
          this.next = this.prev = null;
      }
  }

public class Solution {
    /**
     * @param root: The root of tree
     * @return: the head of doubly list node
     */
    public DoublyListNode bstToDoublyList(TreeNode root) {  
        // Write your code here
        List<Integer> list = new ArrayList<Integer>();
        travelTree(root,list);
        if(list.size()==0)
        	return null;
        DoublyListNode node = new DoublyListNode(list.get(0));
        DoublyListNode head = node;
        for(int i=1; i<list.size(); i++){
        	DoublyListNode tmp = new DoublyListNode(list.get(i));
        	node.next = tmp;
        	tmp.prev = node;
        	node = node.next;
        }
        return head;
    }

    public void travelTree(TreeNode root,List<Integer> list){
    	if(root==null)
    		return;
    	if(root.left!=null)
    		travelTree(root.left,list);
    	list.add(root.val);
    	if(root.right!=null)
    		travelTree(root.right,list);
    }
}
