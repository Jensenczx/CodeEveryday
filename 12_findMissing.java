public class Solution {
    /**    
     * @param nums: an array of integers
     * @return: an integer
     */
    public int findMissing(int[] nums) {
        // write your code here
        int number=0;
        if(nums==null)
        	return number;
        if(nums.length==0)
        	return 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++)
        	sum +=nums[i];
        return calSum(nums.length+1-sum);
    }

	public int calSum(int length){
		if(length%2==0)
			return length/2*(length-1);
		else return length/2*(length-1)+(length-1)/2;
	}
}