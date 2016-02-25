public class Solution {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        // write your code here
        if(A==null||B==null||A.length()==0||B.length()==0)
        	return 0;
        int lenOfA = A.length();
        int lenOfB = B.length();
        int[][] longSubString = new int[lenOfB][lenOfA];
        int max = 0;
        for(int i=0; i<lenOfA; i++){
        	if(B.charAt(0)==A.charAt(i)){
        		longSubString[0][i] = 1;
        		max = 1;
        	}
        }
        for(int i=1; i<lenOfB; i++){
        	for(int j=0; j<lenOfA; j++){
        		if(B.charAt(i)==A.charAt(j)){
                    if(j-1>=0)
                        longSubString[i][j] = longSubString[i-1][j-1]+1;
                    else 
                        longSubString[i][j]=1;
                    max = Max(longSubString[i][j],max);
        		}
        	}
        }
        return max;
    }

    public int Max(int a,int b){
    	return a>b?a:b;
    }
}