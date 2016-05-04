public class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
        if(prices==null||prices.length<=1)
        	return 0;
        int min = prices[0];
        int result = 0;
       	for(int i=1; i<prices.length; i++){
       		int tmp = prices[i]-min;
       		if(tmp>result)
       			result = tmp;
       		if(prices[i]<min)
       			min = prices[i];
       	}
       	return result;
    }
}