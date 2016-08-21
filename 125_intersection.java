public class Solution {
    /**
     * @param nums1 an integer array
     * @param nums2 an integer array
     * @return an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // Write your code here
        if(nums1 == null || nums2 == null)
        	return null;
        HashMap<Integer, Integer> map = new HashMap();
    	for (int i = 0; i < nums1.length; i++) {
    		if (map.get(nums1[i]) != null){
    			map.put(nums1[i], map.get(nums1[i]) + 1);
    		} else {
    			map.put(nums1[i], 1);
    		}
    	}
    	ArrayList<Integer> list = new ArrayList();
    	for (int j = 0; j < nums2.length; j++) {
    		if(map.containsKey(nums2[j]) && map.get(nums2[j]) > 0){
    			list.add(nums2[j]);
    			map.put(nums2[j], map.get(nums2[j]) - 1);
    		}
    	}

    	int[] result = new int[list.size()];
    	
    	for (int k = 0; k < list.size(); k++){
    		result[k] = list.get(k);
    	}
    
    	return result;
    }
}