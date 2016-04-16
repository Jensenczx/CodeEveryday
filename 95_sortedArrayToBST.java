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
     * @param A: an integer array
     * @return: a tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {  
        // write your code here
        if(A==null||A.length==0)
        	return null;
        return buildTree(A,0,A.length-1);
    }  

    public TreeNode buildTree(int[] A,int start,int end){
    	if(start==end){
    		return new TreeNode(A[start]);
    	}else if(start<end){
    		return null;
    	}
    	else{
    		int mid = (start+end)/2;
    		TreeNode node = new TreeNode(A[mid]);
    		node.left = buildTree(A,start,mid-1);
    		node.right = buildTree(A,mid+1,end);
    		return node;
    	}
    }
}
