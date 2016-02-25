public class Solution {
    /**
     * @param nums: The integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    public int longestIncreasingSubsequence(int[] nums) {
        // write your code here
        if(nums==null||nums.length==0)
        	return 0;
        int len = nums.length;
        int []dp = new int[len];
        dp[0] = 1;
        int result=0;
        for(int i=1; i<len; i++){
        	int max=0;
        	for(int j=0; j<i; j++){
        		if(nums[j]<=nums[i]&&dp[j]>max)
        			max = dp[j];
        	}
        	dp[i] = max+1;
        	if(dp[i]>result)
        		result = dp[i];
        }
        return result;
    }
}
