class Solution {
    /**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // Write your code here
        int lenA = 0;
        int lenB = 0;
        if(A!=null)
        	lenA = A.length;
        if(B!=null)
        	lenB = B.length;
        int [] result = new int[lenA+lenB];
        int i=0,j=0,k=0;
        while(i<lenA&&j<lenB){
        	if(A[i]<B[j]){
        		result[k++] = A[i++];
        	}else{
        		result[k++] = B[j++];
        	}
        }
       	if(i==lenA){
       		while(j<lenB)
       			result[k++] = B[j++];
       	}else{
       		while(i<lenA)
       			result[k++] = A[i++];
       	}
       	return result;
    }
}