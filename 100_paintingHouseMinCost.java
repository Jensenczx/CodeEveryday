public class Solution {
    /**
     * @param costs n x 3 cost matrix
     * @return an integer, the minimum cost to paint all houses
     */
    public int minCost(int[][] costs) {
        // Write your code here
    	if(costs==null||costs.length==0)
    		return 0;
    	int len = costs.length;
    	int[][] minCost = new int[len][3];
    	for(int i=0; i<3; i++){
    		minCost[0][i] = costs[0][i];
    	}
    	for(int j=1; j<len; j++){
    		minCost[j][0] = Min(minCost[j-1][1],minCost[j-1][2]) + costs[j][0];
    		minCost[j][1] = Min(minCost[j-1][0],minCost[j-1][2]) + costs[j][1];
    		minCost[j][2] = Min(minCost[j-1][0],minCost[j-1][1]) + costs[j][2];
    	}

    	return Min(Min(minCost[len-1][0],minCost[len-1][1]),minCost[len-1][2]);
    }

    private int Min(int num1,int num2){
    	return num1>num2?num2:num1;
    }


}