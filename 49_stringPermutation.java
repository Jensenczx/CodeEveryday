public class Solution {
    /**
     * @param A a string
     * @param B a string
     * @return a boolean
     */
    public boolean stringPermutation(String A, String B) {
        // Write your code here
        if(A==B)
        	return true;
        if(A==null||B==null||A.length()!=B.length())
        	return false;
        int len = A.length();
        int[] array1 = new int[256];
        int[] array2 = new int[256];
        for(int i=0; i<len; i++){
        	array1[A.charAt(i)]++;
        	array2[B.charAt(i)]++;
        }
        for(int i=0; i<256; i++){
        	if(array1[i]!=array2[i])
        		return false;
        }
        return true;
    }
}