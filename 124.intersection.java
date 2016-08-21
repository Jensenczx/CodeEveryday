import java.util.*;
public class Solution {
    /**
     * @param nums1 an integer array
     * @param nums2 an integer array
     * @return an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // Write your code here
        if (nums1 == null || nums2 == null)
        	return null;
    	HashMap<Integer, Integer> map = new HashMap();
    	for (int i = 0; i < nums1.length; i++) {
    		map.put(nums1[i], 0);
    	}
    	int len = 0;
    	for (int j = 0; j < nums2.length; j++) {
    		if(map.containsKey(nums2[j])){
    			if(map.get(nums2[j]) != 1){
    				map.put(nums2[j], 1);
    			 	len++;
    			}
    		}
    	}
    	int[] result = new int[len];
    	int i = 0;
    	for(Integer key : map.keySet()){
    		int tmp = map.get(key);
    		if(tmp == 1){
    			result[i++] = key;
    		}
    	}
    	return result;
    }


//排序后通过双指针来解决
    public int[] intersection(int[] nums1, int[] nums2) {
    	if (nums1 == null || nums2 == null)
        	return null;
        sort(nums1);
        sort(nums2);
        int len = nums1.length > nums2.length ? nums1.length : nums2.length;
        int[] tmp = new int[len];
        int i, j, k = 0;
        while(i < nums1.length && j < nums2.length) {
        	if(nums1[i] == nums2[j]){
        		if (k == 0)
        			tmp[k++] = nums1[i]; 
        		if(k > 0 && tmp[k-1] != nums1[i])
        			tmp[k++] = nums1[i];
        		i++;
        		j++;
        	}else if (nums1[i] > nums2[j]){
        		j++;
        	}else {
        		i++;
        	}
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++){
        	result[i] = tmp[i];
        }
        return result;
    }

    public void sort(int[] nums, int low, int high){
    	if (low >= high)
    		return;
    	int mid = partation(nums, low, high);
    	sort(nums, low, mid-1);
    	sort(nums, mid+1, high);
    }

    public int partation(int[] nums, int low, int high){
    	int lowFlag = low;
    	int highFlag = high + 1;
    	while(true){
        	while(array[++lowFlag] <= array[low]) if(lowFlag == high) break;
        	while(array[--highFlag] >= array[low]) if(highFlag == low) break;
        	if(lowFlag >= highFlag) break;
        	exch(array, lowFlag, highFlag);
    	}
    	exch(array, low, highFlag);
    	return highFlag;
    }

    public void exch(int[] array, int i, int j){
    	int tmp = array[i];
    	array[i] = array[j];
    	array[j] = tmp;
	}
}