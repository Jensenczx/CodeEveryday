class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(nums==null||nums.size()==0)
        	return result;
        int len = nums.size();
        int start = 0;
        travel(nums,result,start,len);
        return result;
    }

    public void travel(ArrayList<Integer> nums,ArrayList<ArrayList<Integer>> result,int start,int end){
    	if(start==end){
    		result.add(nums);
    	}
    	for(int i=start; i<end; i++){
    		int tmp = nums.get(start);
    		nums.set(start,nums.get(i));
    		nums.set(i,tmp);
    		ArrayList<Integer> tmpList = new ArrayList<Integer>(nums);
    		travel(tmpList,result,start+1,end);
    		tmp = nums.get(start);
    		nums.set(start,nums.get(i));
    		nums.set(i,tmp);
    	}
    }

}
