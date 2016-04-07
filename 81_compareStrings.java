public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
      	if(B==null)
      		return true;
      	if(A==null)
      		return false;
      	int []table = new int[26];
      	for(int i=0; i<A.length(); i++){
      		table[A.charAt(i)-'A']++;
      	}
      	for(int j=0; j<B.length(); j++){
      		table[B.charAt(j)-'A']--;
      	}
      	for(int k=0; k<table.length; k++){
      		if(table[k]<0)
      			return false;
      	}
      	return true;
    }
}