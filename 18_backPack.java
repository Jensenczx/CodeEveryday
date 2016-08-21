public class Solution {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] A) {
        // write your code here
            if (A == null || 0 == A.length || m == 0)
               return 0;

          int len = A.length;
          int[][]  sum = new int[len][m+1];
          for(int i = 0; i < len; i++){
               sum[i][0] = 0;
          }
          for(int j = 0; j < m+1; j++){
               if(j >= A[0]){
                    sum[0][j] = A[0];
               }
          }

          for(int i = 1; i < len; i++){
               for(int j = 1; j < m+1; j++){
                    if(j >= A[i]){
                         sum[i][j] = max(sum[i-1][j], sum[i-1][j-A[i]]+A[i]);
                    }else{
                         sum[i][j] = sum[i-1][j];
                    }
               }
          }

          return sum[len-1][m];
    }
    public int max(int a, int b) {
          return a > b ? a : b;
     }
    }
}