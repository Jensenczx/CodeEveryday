public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
         int result,num=0;
        if(nums==null||nums.size()==0)
          return result;
        int result = nums.get(0);
        num++;
        int len = nums.size();
        for(int i=1; i<len; i++){
            if(nums.get(i)==result)
              num++;
            else{
              if(--num==0){
                result = nums.get(i);
                num++;
              } 
            }
        }
        return result;
    }
}