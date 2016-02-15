public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        int result=0,num=0;
        if(nums==null)
        	return result;
        if(nums.size()==0)
        	return result;
       	for(int tmp:nums){
       		if(num==0){
       			result = tmp;
       			num++;
       		}else if(num!=0&&tmp==result)
       			num++;
       		else if(num!=0&&tmp!=result){
       			if(--num==0)
       				result = tmp;
       		}
       	}
       	return result;
    }
}