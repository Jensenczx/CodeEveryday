public class Solution {
    /**
     * @param matrix: A list of lists of integers
     * @param: A number you want to search in the matrix
     * @return: An integer indicate the occurrence of target in the given matrix
     */
    public int searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix==null||matrix.length==0||matrix[0].length==0)
        	return 0;
        int nums=0;
        int col = matrix[0].length;
        int row = matrix.length;
        int i=col-1;
        int j=0;
        while(i>=0&&j<row){
        	if(target>matrix[j][i])
        		j++;
        	else if(target<matrix[j][i])
        		i--;
        	else if(target==matrix[j][i]){
        		i--;
        		j++;
        		nums++;
        	}
        }
        return nums;
    }
}