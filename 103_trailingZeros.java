class Solution {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here
        if(n==0)
        	return 1;
        long sum = 0;
        for(long i=5; i<=n; i++){
        	sum+= fiveNumber(i);
        }
        return sum;
    }

    public long fiveNumber(long i){
    	long result = 0;
    	while(i!=0){
    		if(i%5==0)
    			result++;
    		i = i/5;
    	}
    	return result;
    }


    public long trailingZeros(long n){
    	long result = 0;
    	long send = 5;
    	while(n/send!=0){
    		result += n/send;
    		send = send*5;
    	}
    	return send;
    }
};
