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
     *@param A: a list of integer
     *@return: The root of Segment Tree
     */
    public SegmentTreeNode build(int[] A) {
        // write your code here
        if(A==null||A.length==0)
        	return null;
        return buildSegmetTree(A,start,A.length-1);
    }

    public SegmentTreeNode buildSegmetTree(int[] A,int start,int end){
    	if(start==end){
    		SegmentTreeNode node = new SegmentTreeNode(start,end,A[start]);
    		node.max = A[start];
    		return node;
    	}else{
    		SegmentTreeNode node = new SegmentTreeNode(start,end,0);
    		int mid = (start+end)/2;
    		node.left = buildSegmetTree(A,start,mid);
    		node.right = buildSegmetTree(A,mid+1,end);
    		node.max = max(node.left.max,node.right.max);
    		return node;
    	}
    }

    private int max(int num1,int num2){
    	return num1>num2?num1:num2;
    }
}