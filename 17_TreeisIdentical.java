class TreeNode {
      public int val;
     public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
  }
public class Solution {
    /**
     * @param a, b, the root of binary trees.
     * @return true if they are identical, or false.
     */
    public static boolean isIdentical(TreeNode a, TreeNode b) {
        // Write your code here
        if(a==null&&b==null)
        	return true;
        else if(a==null||b==null)
        	return false;
        else if(a.val==b.val)
        	return isIdentical(a.left,b.left)&&isIdentical(a.right,b.right);
        return false;
    }

    public static void main(String[]args){
    	TreeNode node1 = new TreeNode(1);
       	TreeNode node2 = new TreeNode(1);

    	System.out.println(isIdentical(node1,node2));
    }
}