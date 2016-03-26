public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if(s==null&&t==null||s.length()==0&&t.length()==0)
        	return true;
        if(s==null||t==null||s.length()==0||t.length()==0)
        	return false;
        int lens = s.length();
        int lent = t.length();
        if(lens!=lent)
        	return false;
        int[] hashTable = new int[256];
        for(int i=0; i<lens; i++){
        	hashTable[s.charAt(i)]++;
        	hashTable[t.charAt(i)]--;
        }
        for(int j=0; j<256; j++){
        	if(hashTable[j]!=0)
        		return false;
        }
        return true;
    }
};