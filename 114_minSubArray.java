public class Solution {
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(ArrayList<Integer> nums) {
        // write your code
        if(nums==null||nums.size()==0)
        	return 0;
        int size = nums.size();
       	int tmp = nums.get(0);
       	int min = tmp;
       	for(int i=1; i<size; i++){
       		int foo = nums.get(i);
       		if(foo+tmp<=tmp&&foo+tmp<=foo)
       			tmp += foo;
       		else if(foo+tmp>foo)
       			tmp = foo;
       		else if(foo+tmp>tmp){
       			if(tmp<min)
       				min = tmp;
       			tmp+=foo;
       		}
       	}
       	if(tmp<min)
       		min = tmp;
        return min;
    }
}