public class Solution {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here;
        if(nums==null||nums.length==0)
        	return;
        int len = nums.length;
        int num = 0;
        for(int i=0; i<len; i++){
        	if(nums[i]%2==0){
        		num++;
        	}
        }
        int tmp = num;
        for(int i=len-1; i>=0&&num>0; i--){
        	if(nums[i]%2==0){
        		exch(nums,i,((len-1)-(tmp-num)));
        		num--;
        	}
        }

    }

    public void exch(int[]array,int a,int b){
    	int tmp = array[a];
    	array[a] = array[b];
    	array[b] = tmp;
    }
}