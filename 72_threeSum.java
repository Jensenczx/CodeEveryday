public class Solution {
    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(numbers==null||numbers.length==0)
        	return result;
        int len = numbers.length;
        for(int i=0; i<len-2; i++){
        	for(int j=i+1; j<len-1; j++){
        		for(int k=j+1; k<len; k++){
        			if(numbers[i]+numbers[j]+numbers[k]==0){
        				ArrayList<Integer> list = new ArrayList<Integer>();
        				add(numbers[i],numbers[j],numbers[k],list);
        				result.add(list);
        			}
        		}
        	}
        }
        return result;
    }

    public void add(int number1,int number2,int number3,ArrayList<Integer> list){
    	int tmp  = 0;
    	if(number2<number1){
    		tmp = number1;
    		number1 = number2;
    		number2 = tmp;
    	}
    	if(number3<number1){
    		tmp = number1;
    		number1 = number3;
    		number3 = tmp;
    	}
    	if(number3<number2){
    		tmp = number2;
    		number2 = number3;
    		number3 = tmp;
    	}
    	list.add(number1);
    	list.add(number2);
    	list.add(number3);
    }



}