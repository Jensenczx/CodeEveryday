public class Solution {
    /**
     * @param nums: an array of integers
     * @return: return nothing (void), do not return anything, modify nums in-place instead
     */
    public void nextPermutation(int[] nums) {
        // write your code here
        if(nums==null||nums.length==0||nums.length==1)
        	return;
        int len = nums.length;
        int min = 0;
        boolean isNeedModify = false;
        int flag = 0;
        int i = len-2;
        for(i; i>=0; i--){
        	isNeedModify = false;
        	for(int j=i+1; j<len; j++){
        		if(nums[j]>nums[i]){
        			if(!isNeedModify){
        				isNeedModify = true;
        				min = nums[j];
        				flag = j;
        			}else{
        				if(nums[j]<=min){
        					min = nums[j];
        					flag = j;
        				}
        			}
        		}
        	}
        	if(isNeedModify){
        		swap(i,flag,nums);
        		break;
        	}
        }
        sort(i,len-1,nums);
    }

    private void swap (int num1,int num2,int []nums){
    	int tmp = nums[num1];
    	nums[num1] = nums[num2];
    	nums[num2] = tmp;
    }

   private void sort(int start,int end,int []nums){
   		for(int i=start, i<end; i++){
   			for(int j=i+1; j<=end; j++){
   				if(nums[j]<nums[i])
   					swap(i,j,nums);
   			}
   		}
   }

   
}