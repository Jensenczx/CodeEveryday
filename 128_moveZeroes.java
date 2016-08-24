给一个数组 nums 写一个函数将 0 移动到数组的最后面，非零元素保持原数组的顺序

 注意事项
1.必须在原数组上操作
2.最小化操作数

给出 nums = [0, 1, 0, 3, 12], 调用函数之后, nums = [1, 3, 12, 0, 0].

public class Solution {
  
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length <= 1)
        	return;
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer2 < nums.length) {
        	if(nums[pointer1] == 0){
        		if(nums[pointer2] != 0)
        			exch(nums, pointer1, pointer2);
        		pointer2++;
        	} else {
        		if(pointer2 <= pointer1)
        			pointer2++;
        		pointer1++;
        	}
        }
    }

    public void exch(int[] array, int index1, int index2) {
    	int tmp = array[index1];
    	array[index1] = array[index2];
    	array[index2] = tmp;
    }
}