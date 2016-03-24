class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        if(A==null||A.length<3)
        	return -1;
        int len = A.length;
        for(int i=1; i<len; i++){
        	if(A[i]>A[i-1]&&A[i]>A[i+1])
        		return i;
        }
        return -1;
    }

    public int findPeak(int[] A){
    	if(A==null||A.length<3)
    		return -1;
    	int start = 0;
    	int end = A.length-1;
    	while(start<=end){
    		if(start==end)
    			return start;
    		int mid = start+(end-start)/2;
    		if(A[mid]<A[mid+1]){
    			start = mid+1;
    		}else{
    			end = mid;
    		}
    	}
    }
}
