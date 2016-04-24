public class Solution {
    /**
     * @param n non-negative integer, n posts
     * @param k non-negative integer, k colors
     * @return an integer, the total number of ways
     */
    public int numWays(int n, int k) {
        // Write your code here
        int[] result = new int[n];
        if(n==1)
        	return k;
        if(n==2)
        	return k*k;
        for(int i=0; i<2; i++){
        	result[i] = (int)Math.pow(k,i);
        }
        for(int j=2; j<n; j++){
        	result[j] = result[j-1]*k-result[j-2];
        }
        return result[n-1];
    }

}