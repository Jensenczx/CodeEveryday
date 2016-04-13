/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */
 class SegmentTree{
	int start,end;
	long sum;
	SegmentTree left,right;
	public SegmentTree(int start,int end,long sum){
		this.start = start;
		this.end = end;
		this.sum = sum;
		left = null;
		right = null;
	}

}
public class Solution {
    /**
     *@param A, queries: Given an integer array and an query list
     *@return: The result list
     */
    public ArrayList<Long> intervalSum(int[] A, 
                                       ArrayList<Interval> queries) {
        // write your code here
         ArrayList<Long> list = new ArrayList<Long>();
        if(A==null||A.length==0||queries==null||queries.size()==0)
        	return list;
        SegmentTree root = buildTree(A,0,A.length-1);
        for(int i=0; i<queries.size(); i++){
        	Interval interval = queries.get(i);
        	list.add(query(root,interval.start,interval.end));
        }
        return list;
    }
    
    public SegmentTree buildTree(int[] A,int start,int end){
    	if(start==end){
    		return new SegmentTree(start,end,A[start]);
    	}else{
    		SegmentTree root = new SegmentTree(start,end,0);
    		int mid = (start+end)/2;
    		root.left = buildTree(A,start,mid);
    		root.right = buildTree(A,mid+1,end);
    		root.sum = root.left.sum+root.right.sum;
    		return root;
    	}
    }

    public long query(SegmentTree tree,int start,int end){
    	if(tree.start==start&&tree.end==end){
    		return tree.sum;
    	}else{
     		int mid = (tree.start+tree.end)/2;
    		if(end<=mid){
    			return query(tree.left,start,end);
    		}else if(start>mid){
    			return query(tree.right,start,end);
    		}else{
    			return query(tree.left,start,mid)+query(tree.right,mid+1,end);
    		}
    	}
    }
}
