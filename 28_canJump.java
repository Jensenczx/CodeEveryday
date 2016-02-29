public class Solution {
    /**
     * @param A: A list of integers
     * @return: The boolean answer
     */
    public static boolean canJump(int[] A) {
        // wirte your code here
        if(A==null||A.length==0)
            return false;
        int len = A.length;
        boolean dp = false;
        int flag=1;
        for(int i=len-1; i>=0; i--){
            if(A[i]>=flag){
                dp = true;
                flag = 1;
            }
            else{
                flag++;
                dp = false;
            }
        }
        return dp;

    }

    public boolean canJump(int[] A){
        if(A==null||A.length==0)
            return false;
        int len = A.length;
        boolean [] dp = new boolean[len];
        for(int i=0; i<len; i++)
            dp[i] = false;
        dp[0] = true;
        for(int i=1; i<len; i++){
            for(int j=i-1; j>=0; j--){
                if(dp[j]==true&&A[j]>=i-j)
                    dp[i]=true;
            }
    }
    return dp[len-1];
    }

    public static void main(String[]args){

        }
    }
}