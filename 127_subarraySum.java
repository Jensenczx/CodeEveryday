public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0)
        	return null;
        ArrayList<Integer> list = new ArrayList(2);
        HashMap<Integer, Integer> map = new HashMap();
       	map.put(0, -1);

       	int sum = 0;
       	for (int i = 0; i < nums.length; i++) {
       		sum += nums[i];
       		if(map.containsKey(sum)){
       			if (i == 0){
       				list.add(0);
       				list.add(0);
       			} else {
       				list.add(map.get(sum)+1);
       				list.add(i);
       			}
       			return list;
       		}else {
       			map.put(sum, i);
       		}
       	}
       	return list;
    }
}