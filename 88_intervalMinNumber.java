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
	int start,end,min;
	SegmentTree left,right;
	public SegmentTree(int start,int end,int min){
		this.min = min;
		this.start = start;
		this.end = end;
		left = null;
		right = null;
	}
}
public class Solution {
    /**
     *@param A, queries: Given an integer array and an query list
     *@return: The result list
     */
    public ArrayList<Integer> intervalMinNumber(int[] A, 
                                                ArrayList<Interval> queries) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(A==null||A.length==0)
        	return list;
        SegmentTree tree = buildTree(A,0,A.length-1);
        for(int i=0; i<queries.size(); i++){
        	Interval interval = queries.get(i);
        	list.add(query(tree,interval.start,interval.end));
        }
        return list;

    }

    public SegmentTree buildTree(int []A,int start,int end){
    	if(start == end){
    		return new SegmentTree(start,end,A[start]);
    	}else{
    		SegmentTree root = new SegmentTree(start,end,0);
    		int mid = (start+end)/2;
    		root.left = buildTree(A,start,mid);
    		root.right = buildTree(A,mid+1,end);
    		root.min = Min(root.left.min,root.right.min);
    		return root;
    	}
    }

    public int query(SegmentTree root,int index1,int index2){
    	if(index1==root.start&&index2==root.end){
    		return root.min;
    	}else{
    		int mid = (root.start+root.end)/2;
    		if(index1>mid){
    			return query(root.right,index1,index2);
    		}else if(index2<=mid){
    			return query(root.left,index1,index2);
    		}else{
    			return Min(query(root,index1,mid),query(root,mid+1,index2));
    		}
    	}
    }


    public int Min(int num1,int num2){
    	return num1>num2?num2:num1;
    }
}