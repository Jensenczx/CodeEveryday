class Solution {
    /*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
    public int kthLargestElement(int k, int[] nums) {
        // write your code here
        if(nums==null||nums.length==0||nums.length<k)
        	return 0;
        int len = nums.length;
        int high = len-1;
        int low = 0;
        int item = k-1;
        while(true){
        	int target = partition(nums,low,high);
        	if(target==item) return nums[target];
        	if(target<item) low = target+1;
        	else if(target>item) high = target-1;
        }
    }

   private static int partition(int[] array,int lo,int high){
   		if(lo==high)
   			return high;
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