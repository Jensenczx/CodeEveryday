public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int [] result = new int[2]();
        if(numbers==null||numbers.length==0)
        	return result;
        for(int i=0; i<numbers.length-1; i++){
        	for(int j=i+1; j<numbers.length; j++){
        		if(numbers[i]+numbers[j]==target){
        			result[0]=i+1;
        			result[1]=j+1;
        		}

        	}
        }
        return result;
    }
}