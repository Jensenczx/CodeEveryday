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
     *@param root, start, end: The root of segment tree and 
     *                         an segment / interval
     *@return: The maximum number in the interval [start, end]
     */
    public int query(SegmentTreeNode root, int start, int end) {
        // write your code here
        if(root==null)
        	return 0;
        if(root.start==start&&root.end==end)
        	return root.max;
        else{
        	int midum = (root.start+root.end)/2;
        	if(start>midum)
        		return query(root.right,start,end);
        	else if(end<=midum)
        		return query(root.left,start,end);
        	else
        		return max(query(root.left,start,midum),query(root.right,midum+1,end));
        }
    }

    private max(int num1,int num2){
    	return num1>num2?num1:num2;
    }
}