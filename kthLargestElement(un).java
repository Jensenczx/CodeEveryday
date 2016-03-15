class Solution {
    /*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
    public int kthLargestElement(int k, int[] nums) {
        // write your code here
        if(nums==null||nums.length==0||nums.length<=k)
        	return 0;
        int len = nums.length;
        int low = 0;
        int target = partation(nums,low,len-1);
        int item = k-1;
        while(target!=item){
        	if(target<item){
        		if(target+1>=len-1)
        			return nums[target+1];
        		target = partation(nums,target+1,len-1);
        	}
        	else if(target>item){
        		if(target-1==low)
        			return nums[target-1];
        		target = partation(nums,low,target-1);
        	}
        }
        return nums[target];
    }

   private static int partition(int[] array,int lo,int high){
		int lowFlag = lo;
		int highFlag = high+1;
		while(true){
			while(array[++lowFlag]>=array[lo]) if(lowFlag==high) break;
			while(array[--highFlag]<=array[lo]) if(highFlag==lo) break;
			if(lowFlag>=highFlag) break;
			exch(array,lowFlag,highFlag);
		}
		exch(array,lo,highFlag);
		return highFlag;
	}

	private void exch(int[] array,int i,int j){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

}