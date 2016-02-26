public class Solution {
    /**
     * @param triangle: a list of lists of integers.
     * @return: An integer, minimum path sum.
     */
    public int minimumTotal(int[][] triangle) {
        // write your code here
        if(triangle==null||triangle.length==0)
        	return 0;
        int len = triangle.length;
        int [][] cost = new int[len][len];
        cost[0][0]=triangle[0][0];
        for(int i=1; i<len; i++){
        	for(int j=0; j<triangle[i].length; j++){
        		int lower = max(0,j-1);
        		int upper = min(j,triangle[i-1].length-1);
        		cost[i][j]= min(cost[i-1][lower],cost[i-1][upper])+triangle[i][j];
        	}
        }
        int minCost = Integer.MAX_VALUE;
        for(int k=0; k<triangle[len-1].length; k++){
        	minCost = min(minCost,cost[len-1][k]);
        }

       return minCost;
    }

    public int max(int a, int b) {
          return a > b ? a : b;
     }
     public int min(int a, int b) {
          return a < b ? a : b;
     }
}
