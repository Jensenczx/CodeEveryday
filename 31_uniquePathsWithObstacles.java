public class Solution {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
         if(obstacleGrid==null||obstacleGrid.length==0||obstacleGrid[0].length==0)
        	return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][] result = new int[m][n];
        for(int i=0; i<m; i++){
            if(obstacleGrid[i][0]==1)
                break;
            else result[i][0]=1;
        }
        for(int j=0; j<n; j++){
            if(obstacleGrid[0][j]==1)
                break;
            else result[0][j] = 1;
        }
        for(int i=1; i<m; i++){
        	for(int j=1; j<n; j++){
                if(obstacleGrid[i][j]==1)
                    continue;
        		else result[i][j] = result[i-1][j]+result[i][j-1];
        	}
        }
        return result[m-1][n-1];
    }
}