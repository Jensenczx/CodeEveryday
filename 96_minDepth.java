/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int minDepth(TreeNode root) {
        // write your code here
        if(root==null)
        	return 0;
        int leftMin = 1+minDepth(root.left);
        int rightMin = 1+minDepth(root.right);
        int min = Min(leftMin,rightMin);
        if(min==1)
            return Max(leftMin,rightMin);
        return min;
    }
    
    public int Min(int num1,int num2){
    	return num1<num2?num1:num2;
    }
    
    public int Max(int num1,int num2){
        return num1>num2?num1:num2;
    }
}