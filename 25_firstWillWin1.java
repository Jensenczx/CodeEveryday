public class Solution {
    /**
     * @param n: an integer
     * @return: a boolean which equals to true if the first player will win
     */
    public boolean firstWillWin(int n) {
        // write your code here
        if(n<=0)
        	return false;
        if(n==1||n==2)
        	return true;
        boolean [][]dp = new boolean[n+1][2];
        dp[1][0] = true;
        dp[1][1] = false;
        dp[2][0] = true;
        dp[2][1] = false;
        for(int i=3; i<=n; i++){
        	for(int j=0; j<=1; j++){
        		if(j==1)
        			dp[i][j]=dp[i-1][j-1]&&dp[i-2][j-1];
        		else dp[i][j] = dp[i-1][1-j]||dp[i-2][1-j];
        	}
        }
        return dp[n][0];
    }
}