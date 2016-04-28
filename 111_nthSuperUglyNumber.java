public class Solution {
    /**
     * @param n a positive integer
     * @param primes the given prime list
     * @return the nth super ugly number
     */
    public int nthSuperUglyNumber(int n, int[] primes) {
        // Write your code here
        if(n==1)
        	return 1;
        if(primes==null||primes.length==0)
        	return 0;
        int [] arr = new int[n];
        arr[0] = 1;
        int [] tmp = new int[primes.length];
        for(int i=1; i<n; i++){
        	arr[i]=min(arr,tmp,primes);
        }
        return arr[n-1];
    }

    private int min(int[] array,int[] index,int[] primes){
    	int res = Integer.MAX_VALUE;
    	for(int i=0; i<index.length; i++){
    		int tmp = array[index[i]]*primes[i];
    		if(tmp<res)
    			res = tmp;
    	}
    	for(int j=0; j<index.length; j++){
    		int tmp = array[index[j]]*primes[j];
    		if(tmp==res)
    			index[j]++;
    	}
    	return res;
    }
}