public class Solution {
    /**
     * @param n the integer to be reversed
     * @return the reversed integer
     */
    public int reverseInteger(int n) {
        // Write your code here
        long result = 0;
        if(n<0){
        	while(n!=0){
        		result=result*10+Math.abs(n%10);
        		n=n/10;
        	}
        	if(-result<Integer.MIN_VALUE)
        		return 0;
        	return (int)-result;
        }else{
        	while(n!=0){
        		result=result*10+Math.abs(n%10);
        		n=n/10;
        	}
        	if(result>Integer.MAX_VALUE)
        		return 0;
        	return (int)result;
        }
    }
}