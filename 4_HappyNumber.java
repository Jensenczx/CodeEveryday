public class Solution {
    /**
     * @param n an integer
     * @return true if this is a happy number or false
     */
    public static boolean isHappy(int n) {
        // Write your code here
        if(n==0)
        	return false;
        int[] array = new int[811];
        for(int i=0;i<array.length; i++)
            array[i] = 0;
        while(getTheNum(n)!=1){
        	n = getTheNum(n);
            if(array[n]==1)
                return false;
            array[n]=1;
        }
        return true;
    }

    public static int getTheNum(int n){
    	int num = 0;
    	while(n!=0){
    		int tmp = n%10;
    		num += tmp*tmp;
    		n = n/10;
    	}
    	return num;
    }

    public static void main(String[] args){
    	System.out.println(isHappy(19));
    }
}