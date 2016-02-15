public class Solution {
    /**
     * @param A an integer array
     * @return a long integer
     */
    public long permutationIndex(int[] A) {
        // Write your code here
        long number = 0;
        if(A==null||A.length==0)
        	return number;
        for(int i=0;i<A.length-1; i++){
        	int tmp=0;
        	for(int j=i+1;j<A.length; j++){
        		if(A[j]<A[i])
        			tmp++;
        	}
        	number+=tmp*getMutilResult(A.length-i-1);
        }
        return number;
    }

    public long getMutilResult(int n){
    	int result=1;
    	while(n>=1){
    		result = result*n;
    		n--;
    	}
    	return result;
    }

    
}