import java.util.ArrayList;
public class Solution {
    /**
     * @param A: An integer array.
     * @param target: An integer.
     */
    public int MinAdjustmentCost(ArrayList<Integer> A, int target) {
        // write your code here
    	if(A==null||A.size()<=1)
    		return 0;
    	int len = A.size();
    	int range = 100;
    	int[][]cost = new int[len][range+1];
    	for(int i=0; i<range+1; i++){
    		cost[0][i] = Math.abs(i-A.get(0));
    	}
    	for(int i=1; i<len; i++){
    		for(int j=0; j<range+1; j++){
    			int curCost = Math.abs(j-A.get(i));
    			int start = Max(j-target,0);
    			int end = Min(j+target,100);
    			cost[i][j]=Integer.MAX_VALUE;
    			for(int k=start; k<=end; k++)
    				cost[i][j]=Min(cost[i][j],cost[i-1][k]+curCost);
    		}
    	}
    	int min = Integer.MAX_VALUE;
    	for(int i=1; i<range+1; i++)
    		if(cost[len-1][i]<min)
    			min = cost[len-1][i];
    	return min;
    }

    public int Min(int a,int b){
    	return a < b ? a : b;
    }

    public int Max(int a,int b){
    	return a > b? a : b;
    }



}