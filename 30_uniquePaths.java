public class Solution {
    /**
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here 
        if(m<=0||n<=0)
        	return 0;
        int [][] result = new int[m][n];
        for(int i=0; i<m; i++)
        	result[i][0] = 1;
        for(int j=0; j<n; j++)
        	result[0][j] = 1;
        for(int i=1; i<m; i++){
        	for(int j=1; j<n; j++){
        		result[i][j] = result[i-1][j]+result[i][j-1];
        	}
        }
        return result[m-1][n-1];
    }
}