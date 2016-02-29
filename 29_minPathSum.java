public class Solution {
    /**
     * @param grid: a list of lists of integers.
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
        if(grid==null||grid.length==0||grid[0].length==0)
        	return 0;
        int rowLen  = grid.length;
        int colLen = grid[0].length;
        int [][] result = new int[rowLen][colLen];
        result[0][0] = grid[0][0];
        for(int i=1; i<rowLen; i++)
        	result[i][0] = grid[i][0]+result[i-1][0];
        for(int i=1; i<colLen; i++)
        	result[0][i] = grid[0][i]+result[0][i-1];
        for(int i=1; i<rowLen; i++){
        	for(int j=1; j<colLen; j++){
        		result[i][j] = grid[i][j]+min(result[i-1][j],result[i][j-1]);
        	}
        } 
        return result[rowLen-1][colLen-1];
    }

    public int min(int a,int b){
    	return a<b?a:b;
    }
}
