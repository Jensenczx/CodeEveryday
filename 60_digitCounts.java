class Solution {
    /*
     * param k : As description.
     * param n : As description.
     * return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        if(k<0||n<0)
        	return 0;
        int sum = 0;
        for(int i=0; i<=n; i++){
        	sum+=getTheNumber(i,k);
        }
        return sum;

    }

    public int getTheNumber(int num,int k){
    	int times = 0;
    	if(num==k)
    		return 1;
    	while(num!=0){
    		if(num%10==k)
    			times++;
    		num = num/10;
    	}
    	return times;
    }
};
