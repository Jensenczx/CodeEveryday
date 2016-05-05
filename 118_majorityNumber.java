public class Solution {
    /**
     * @param nums: A list of integers
     * @return: The majority number that occurs more than 1/3
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        if(nums==null||nums.size()==0)
        	return 0;
        int size = nums.size();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<size; i++){
        	int num = nums.get(i);
        	if(map.containsKey(num)){
        		map.put(num,map.get(num)+1);
        	}else{
        		map.put(num,1);
        	}
        	if(map.get(num)*3>=size)
        		return num;
        }
        return 0;
    }
}