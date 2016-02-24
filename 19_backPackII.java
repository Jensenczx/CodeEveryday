public class Solution {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A & V: Given n items with size A[i] and value V[i]
     * @return: The maximum value
     */
    public int backPackII(int m, int[] A, int V[]) {
        // write your code here
        if(m==0||A==null||V==null||0==A.length)
        	return 0;
        int len = A.length;
        int [][]val = new int[len][m+1];
        for(int i=0;i<len; i++){
        	val[i][0]=0;
        }
        for(int i=0; i<m+1; i++){
        	if(i>=A[0])
        		val[0][i]=V[0];
        }
        for(int i=1; i<len; i++){
        	for(int j=1;j<m+1; j++){
        		if(j>=A[i]){
        			val[i][j] = max(val[i-1][j],val[i-1][j-A[i]]+V[i]);
        		}else{
        			val[i][j]=val[i-1][j];
        		}
        	}
        }
        return val[len-1][m];
    }
      public int max(int a, int b) {
          return a > b ? a : b;
     }
}