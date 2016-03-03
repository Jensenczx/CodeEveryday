public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        // write your code here
        if(num==null)
        	return 0;
        return minNum(num,0,num.length-1);
    }
     private int minNum(int[] num, int low, int high){
        if(low==high)
            return num[low];
        int mid = low+(high-low)/2;
        if(num[mid]>num[high])
            return minNum(num,mid+1,high);
        else 
            return minNum(num,low,mid);
    }
}