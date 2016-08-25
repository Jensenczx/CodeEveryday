克隆二叉树
深度复制一个二叉树。

给定一个二叉树，返回一个他的 克隆品 。
public class Solution {
    public TreeNode cloneTree(TreeNode root) {
        // Write your code here
        if(root == null)
        	return null;
       	TreeNode newRoot = new TreeNode(root.val);
       	newRoot.left = cloneTree(root.left);
       	newRoot.right = cloneTree(root.right);
       	return newRoot;
    }
}