public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        if(n<=0)
        	return 0;
        if(n==1)
        	return 1;
        if(n==2)
        	return 2;
        int []result= new int[n+1];
        result[0]=0;
        result[1]=1;
        result[2]=2;
        for(int i=3; i<=n; i++)
        	result[i]=result[i-1]+result[i-2];
        return result[n];

    }
}