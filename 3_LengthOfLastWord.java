public class Solution {
    /**
     * @param s A string
     * @return the length of last word
     */
    public static int lengthOfLastWord(String s) {
        // Write your code here
        int length = 0;
        if(s==null||s.length()==0)
        	return length;
        boolean flag = false;
        for(int i=0; i<s.length(); i++){
        	if(s.charAt(i)!=' '){
        		if(flag == true){
        			flag = false;
        			length = 0;
        		}
        		length++;
        	}
        	else flag = true;
        }
        return length;
    }

    public static void main(String []args){
    	System.out.println(lengthOfLastWord("Hello World "));
    }
}