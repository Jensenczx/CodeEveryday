public class Solution {
    /**
     * @param n: An integer.
     * return : An array storing 1 to the largest number with n digits.
     */
    public List<Integer> numbersByRecursion(int n) {
        // write your code here
        List<Integer> mList = new ArrayList<Integer>();
        if(n<=0)
        	return mList;
        else 
        	getTheNum(mList,n,0);
        mList.remove(0);
        return mList;
    }

    public void getTheNum(List<Integer> list,int n,int num){
    	num = num*10;
    	for(int i=0; i<=9; i++){    	
    		if(n==1)
    			list.add(num+i);
    		else
    			getTheNum(list,n-1,num+i);

    	}
    }
}