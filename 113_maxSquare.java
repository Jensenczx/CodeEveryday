public class Solution {
    /**
     * @param matrix: a matrix of 0 and 1
     * @return: an integer
     */
    public int maxSquare(int[][] matrix) {
        // write your code here
       	if(matrix==null||matrix.length==0||matrix[0].length==0)
       		return 0;
       	int len1 = matrix.length;
       	int len2 = matrix[0].length;
       	int [][] result = new int[len1][len2];
       	//状态初始化
       	for(int i=0; i<len2; i++){
       		if(matrix[0][i]==1)
       			result[0][i] = 1;
       	}
       	for(int j=0; j<len1; j++){
       		if(matrix[j][0]==1)
       			result[j][0] = 1;
       	}

       	int max = 0;

       	//状态转移
       	for(int i=1; i<len1; i++){
       		for(int j=1; j<len2; j++){
       			if(matrix[i][j]==1){
       				result[i][j] = go(result,i,j);
       				if(result[i][j]>max){
       					max = result[i][j];
       				}
       			}
       		}
       	}
       	return max*max;
    }

    private int go(int[][] result,int i,int j){
    	return min(min(result[i-1][j],result[i][j-1]),result[i-1][j-1])+1;
    }

	private int min(int num1,int num2){
		return num1>num2?num2:num1;
	}
}