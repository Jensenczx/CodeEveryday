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

     //最长公共子序列的求法,采用动态的规划的方式，将最大值标注在每一个位置上。
     public int longestCommonSubsequence(String A, String B) {
        if (A == null || B == null || A.length() == 0 || B.length() == 0)
            return 0;

        int lenA = A.length();
        int lenB = B.length();
        int [][] array = new int[lenA][lenB];
        int max = 0;

        for(int i = 0; i < lenB;  i++) {
            if(A.charAt(0) == B.charAt(i)){
                array[0][i] = 1;
                max = 1;
            }else{
                array[0][i] = max;
            }
        }

        for(int j = 0; j < lenA; j++) {
            if(A.charAt(j) == B.charAt(0)){
                array[j][0] = 1;
                max = 1;
            }
        }

        for(int i = 1; i < lenA; i++) {
            for(int j = 1; j < lenB; j++) {
                if(A.charAt(i) == B.charAt(j)){
                    array[i][j] = array[i-1][j-1] + 1;
                }else {
                    array[i][j] = max(max(array[i][j-1], array[i-1][j-1]), array[i-1][j]);
                }
            }
        }

        return array[lenA-1][lenB-1];
    }

    public int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}