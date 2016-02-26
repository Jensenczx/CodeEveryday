public class Solution {
    /**
     * @param A: An array of non-negative integers.
     * return: The maximum amount of money you can rob tonight
     */
    public long houseRobber(int[] A) {
        // write your code here
        if(A==null||A.length==0)
        	return 0;
        int len = A.length;
        long []dp = new long[len];
        dp[0] = A[0];
        long max=A[0];
        for(int i=1; i<len; i++){
        	dp[i] = A[i];
        	for(int j=0; j<i-1; j++){
        		dp[i]=Max(dp[i],dp[j]+A[i]);
        	}
        	max = Max(max,dp[i]);
        }
        return max;
    }

    public long houseRobber(int[] A) {
        // write your code here
        if(A==null||A.length==0)
        	return 0;
        int len = A.length;
        if(len==1)
        	return A[0];
        long max1 = A[0];
        long max2 = A[1];
        for(int i=2; i<len; i++){
        	long tmp = max2;
        	max2 = max1+A[i];
        	max1 = tmp;
        	if(max2<max1)
        		max2 = max1;
        }
        return Max(max1,max2);
    }

    public long Max(int a,int b){
    	return a>b?a:b;
    }
}