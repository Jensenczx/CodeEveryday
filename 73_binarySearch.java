class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        if(nums==null||nums.length==0)
            return -1;
        int len = nums.length;
        return binary(nums,0,len-1,target);
    }

    public int binary(int[]nums,int start,int end,int target){
        if(start>end)
            return -1;
        int mid = start+(end-start)/2;
        if(nums[mid]<target){
            return binary(nums,mid+1,end,target);
        }
        if(nums[mid]>target){
            return binary(nums,start,mid-1,target);
        }
        if(nums[mid]==target){
            if((mid-1>=start&&nums[mid-1]<target)||mid==start)
                return mid;
            else if(mid-1>start&&nums[mid-1]==target)
                return binary(nums,start,mid-1,target);
        }
        return -1;
    }
}