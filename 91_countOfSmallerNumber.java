class SegmentTree{
	int start,end;
	int max;
	SegmentTree left,right;
	public SegmentTree(int start,int end,int max){
		this.start = start;
		this.end = end;
		this.max = max;
		left = null;
		right = null;
	}

}
public class Solution {
   /**
     * @param A: An integer array
     * @return: The number of element in the array that 
     *          are smaller that the given integer
     */
    public ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(A==null)
        	return list;
        if(A.length==0){
        	for(int i=0; i<queries.length; i++){
        		list.add(0);
        	}
        	return list;
        }
        SegmentTree root = buildTree(A,0,A.length-1);
        for(int i=0; i<queries.length; i++){
        	list.add(query(root,queries[i]));
        }
        return list;
    }

     public ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(A==null)
        	return list;
        if(A.length==0){
        	for(int i=0; i<queries.length; i++){
        		list.add(0);
        	}
        	return list;
        }
     	int sum = 0;
        for(int i=0; i<queries.length; i++){
        	sum = 0;
        	for(int j=0; j<A.length; j++){
        		if(A[j]<queries[i])
        			sum++;
        	}
        	list.add(sum);
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
    		root.max = MAX(root.left.max,root.right.max);
    		return root;
    	}
    }

    public int query(SegmentTree tree,int target){
    	if(tree.max<target){
    		return tree.end-tree.start+1;
    	}else{
    		if(tree.left==null&&tree.right==null)
    			return 0;
    		else
    			return query(tree.right,target)+query(tree.left,target);
    	}
    }

    public int MAX(int num1,int num2){
    	return num1>num2?num1:num2;
    }


}
