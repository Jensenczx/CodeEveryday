public class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        if(A==null||A.length==0)
        	return 0;
        int index = binarySearch(A,0,A.length-1,target);
        return index;
    }
    
    private int binarySearch(int[] A,int start,int end,int target){
        if(start>end)
            return start;
    	int mid = (start+end)/2;
    	if(A[mid]==target)
    		return mid;
    	else if(A[mid]<target)
    		return binarySearch(A,mid+1,end,target);
    	else
    		return binarySearch(A,0,mid-1,target);
    }
}