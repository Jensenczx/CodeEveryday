public class Solution {
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void flatten(TreeNode root) {
        // write your code hereturro
        TreeNode tmpNode=null,end=root;
        if(root==null)
        	return;
        if(root.left!=null){
        	tmpNode = root.right;
        	root.right = root.left;
        	root.left = null;
        }
        flatten(root.right);
        while(end.right!=null)
        	end = end.right;
        end.right = tmpNode;
        flatten(tmpNode);
    }
   
}