public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code
        if(nums==null||nums.length==0)
        	return 0;
        int len = nums.length;
        int max,tmp=nums[0];
        for(int i=1; i<len; i++){
        	if(nums[i]<0)
        		tmp = max>tmp?max:tmp;
        	if(max<0)
        		max = nums[i];
        	else max += nums[i];
        }
        return max>tmp?max:tmp;
    }
}