/**
 * Definition of SegmentTreeNode:
 * public class SegmentTreeNode {
 *     public int start, end, max;
 *     public SegmentTreeNode left, right;
 *     public SegmentTreeNode(int start, int end, int max) {
 *         this.start = start;
 *         this.end = end;
 *         this.max = max
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     *@param root, index, value: The root of segment tree and 
     *@ change the node's value with [index, index] to the new given value
     *@return: void
     */
    public void modify(SegmentTreeNode root, int index, int value) {
        // write your code here
        if(root==null||index<root.start||index>root.end)
        	return;
        if(root.start==root.end&&root.start==index){
    		root.max = value;
    	}else{
    		int medium = (root.start+root.end)/2;
    		if(index>medium){
    			modify(root.right,index,value);
    			root.max = max(root.right.max,root.left.max);
    		}else{
    			modify(root.left,index,value);
    			root.max = max(root.right.max,root.left.max);
    		}
    	}

    }

    private int max(int num1,int num2){
    	return num1>num2?num1:num2;
    }
}