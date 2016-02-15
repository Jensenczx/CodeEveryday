public class Solution {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public static boolean isValidParentheses(String s) {
        // Write your code here
        if(s==null)
        	return false;
        if(s.length()==1)
        	return false;
        char[] array = new char[s.length()/2+1];
        int index = 0;
        for(int i=0; i<s.length()&&index<s.length()/2+1; i++){
        	char tmp = s.charAt(i);
        	if(tmp=='('||tmp=='['||tmp=='{')
        		array[index++] = tmp;
        	else if(tmp==')'||tmp==']'||tmp=='}'){
        		if(index==0)
        			return false;
        		if((tmp==')'&&array[index-1]=='(')||(tmp==']'&&array[index-1]=='[')||(tmp=='}'&&array[index-1]=='{'))
        			index--;
        		else return false;
        	}
        }
        if(index==s.length()/2+1)
        	return false;
        return true;
    }
    public static void main(String[] args){
    	System.out.println(isValidParentheses("()"));
    }
}