/**
 * Definition of SegmentTreeNode:
 * public class SegmentTreeNode {
 *     public int start, end;
 *     public SegmentTreeNode left, right;
 *     public SegmentTreeNode(int start, int end) {
 *         this.start = start, this.end = end;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     *@param start, end: Denote an segment / interval
     *@return: The root of Segment Tree
     */
    public SegmentTreeNode build(int start, int end) {
        // write your code here
       	SegmentTreeNode head = null;
       	if(start>end)
       		return head; 
        if(start==end)
        	head = new SegmentTreeNode(start,end);
        else{
        	head = new SegmentTreeNode(start,end);
        	head.left = build(start,(end+start)/2);
        	head.right = build((start+end)/2+1,end);
        }
        return head;
    }
}