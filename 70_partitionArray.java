public class Solution {
	/** 
     *@param nums: The integer array you should partition
     *@param k: As description
     *return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
	    //write your code here
	    if(nums==null||nums.length==0)
	    	return 0;
	    int len = nums.length();
	    for(int i=0; i<len; i++){
	    	if(nums[i]==k){
	    		exch(i,0,nums);
	    		break;
	    	}
	    	if(i==len-1){
	    		if(nums[len-1]<k)
	    			return len;
	    	else return 0;
	    	}
	    }
	    return partition(0,nums.length-1,nums);
    }

    public int partition(int low,int high,int[] nums){
    	int lowFlag = low;
    	int highFlag = high+1;
    	int tmp = nums[low];
    	while(true){
    		while(nums[++lowFlag]<tmp) if(lowFlag==high)break;
    		while(nums[--highFlag]>=tmp) if(highFlag==low)break;
    		if(lowFlag>=highFlag) break;
    		exch(lowFlag,highFlag,nums);
    	}
    	exch(low,highFlag,nums);
    	return highFlag;
    }

    public void exch(int num1,int num2,int[] nums){
    	int tmp = nums[num1];
    	nums[num1] = nums[num2];
    	nums[num2] = tmp; 
    }
}