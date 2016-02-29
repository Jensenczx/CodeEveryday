public class Solution {
    /**
     * @param A an array of Integer
     * @return  an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // Write your code here
        if(A==null||A.length==0)
        	return 0;
        int len=A.length;
        if(len==1)
        	return 1;
        int tmp=1;
        int result=1;
        for(int i=1; i<len; i++){
        	if(A[i]>A[i-1])
        		tmp++;
        	else 
        		tmp = 1;
       		if(tmp>result)
        		result = tmp;
        }
        tmp = 1;
        for(int i=1; i<len; i++){
        	if(A[i]<A[i-1])
        		tmp++;
        	else 
        		tmp = 1;
        	if(tmp>result)
        			result = tmp;
        }
        return result;
       
    }
}