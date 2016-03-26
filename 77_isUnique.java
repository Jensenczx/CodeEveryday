public class Solution {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        if(str==null||str.length()==0)
        	return true;
        int []hash = new int[256];
        int len = str.length();
        for(int i=0;i<len; i++){
        	if(hash[str.charAt(i)]++!=0)
        		return false;
        }
        return true;
    }
}