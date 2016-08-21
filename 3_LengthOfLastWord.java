public class Solution {
    /**
     * @param s A string
     * @return the length of last word
     */
    public static int lengthOfLastWord(String s) {
        // Write your code here
        if(s==null||s.length()==0)
        	return 0;
        int length = 0;
        boolean flag = false;
        for(int i = 0; i < s.length(); i++){
        	if(s.charAt(i) != ' '){
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

    public static int lengthOfLastWord(String s){
        if(s == null || s.length() == 0)
            return 0;
        String [] array = s.split(' ');
        return array[array.length-1];
    }

    public static void main(String []args){
    	System.out.println(lengthOfLastWord("Hello World "));
    }
}