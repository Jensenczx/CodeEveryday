class Solution {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if(n<0)
        	return -1;
        if(n==1)
        	return 0;
        if(n==2)
        	return 1;
        int result = 1;
        int preNum = 0;
        while(n-->=3){
            int tmp = result;
            result+=preNum;
            preNum = tmp;
        }
        return result;
    }
}