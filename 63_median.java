public class Solution {
    /**
     * @param nums: A list of integers.
     * @return: An integer denotes the middle number of the array.
     */
    public int median(int[] nums) {
        // write your code here
        if(nums==null||nums.length==0)
            return 0;
        int len = nums.length;
        int low = 0;
        int high = len-1;
        int parIndex = partition(nums,low,high);
        int index = getIndex(len);
        while(parIndex!=index){
            System.out.println(parIndex);
            if(parIndex<index)
                parIndex = partition(nums,parIndex+1,high);
            else if(parIndex>index)
                parIndex = partition(nums,low,parIndex-1);
        }
        return nums[index];
    }

    public int getIndex(int num){
        if(num%2==0)
            return num/2-1;
        return num/2;
    }

     public int partition(int[] array,int low,int high){
    	int lowFlag = low;
    	int highFlag = high+1;
    	while(true){
    		while(array[++lowFlag]<=array[low]) if(lowFlag==high)break;
    		while(array[--highFlag]>=array[low]) if(highFlag==low)break;
    		if(lowFlag>=highFlag) break;
    		exch(array,lowFlag,highFlag);
    	}
    	exch(array,low,highFlag);
    	return highFlag;
    }
    
    private void exch(int[] array,int i,int j){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

    public static void main(String[]args){
        Solution s = new Solution();
        int[] array = {4,5,1,2,3};
        s.median(array);
    }
}