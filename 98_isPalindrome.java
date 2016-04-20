public class Solution {
    /**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // Write your code here
        if(s==null||s.length()==0)
        	return true;
        int len = s.length();
        int i=0,j=len-1;
        while(i<j){
        	if(!isCorrect(s.charAt(i)))
        		i++;
        	else if(!isCorrect(s.charAt(j)))
        		j--;
        	else if(convert(s.charAt(i))==convert(s.charAt(j))){
        		i++;
        		j--;
        	}else return false;
        }
        return true;
    }

    public boolean isCorrect(char a){
    	if((a>='A'&&a<='Z')||(a>='a'&&a<='z')||(a>='0'&&a<='9')){
    		return true;
    	}
    	return false;
    }

    public char convert(char a){
    	if(a>='a'&&a<='z'){
    		return (char)((a-'a')+'A');
    	}
    	return a;
    }
}