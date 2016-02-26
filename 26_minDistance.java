public class Solution {
    /**
     * @param word1 & word2: Two string.
     * @return: The minimum number of steps.
     */
    public int minDistance(String word1, String word2) {
        // write your code here
        if(word1==null||word2==null)
        	return 0;
        int len1 = word1.length();
        int len2 = word2.length();
        if(len1==0||len2==0)
        	return Max(len2,len1);
        int [][]dp = new int[len2+1][len1+1];
        for(int i=0; i<=len1; i++){
        	dp[0][i]=i;
 		}
        for(int i=0; i<=len2; i++){
        	dp[i][0]=i;
        }
       	for(int i=1; i<=len2; i++){
       		for(int j=1; j<=len1; j++){
       			if(word2.charAt(i-1)==word1.charAt(j-1)){
       				dp[i][j] = Min(Min(dp[i-1][j]+1,dp[i][j-1]+1),dp[i-1][j-1]);
       			}else{
       				dp[i][j] = Min(Min(dp[i-1][j]+1,dp[i][j-1]+1),dp[i-1][j-1]+1);
       			}
       		}
       	}
       	return dp[len2][len1];
    }
	public int Max(int a,int b){
		return a>b?a:b; 
	}

	public int Min(int a,int b){
		return a<b?a:b; 
	}
}