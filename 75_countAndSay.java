public class Solution {
    /**
     * @param n the nth
     * @return the nth sequence
     */
    public static String countAndSay(int n) {
        // Write your code here
        String orign = "";
        if(n<=0)
        	return orign;
        orign = "1";
        while(n-->1){
        	orign = delStr(orign);
        }
        return orign;
    }

    public static String delStr(String str){
    	String tmp = "";
    	int num = 0;
    	int len = str.length();
    	char tmpChar = str.charAt(0);
    	num++;
    	for(int i=1; i<len; i++){
    		if(str.charAt(i)==tmpChar)
    			num++;
    		else if(str.charAt(i)!=tmpChar){
    			tmp = tmp+num+tmpChar;
    			tmpChar = str.charAt(i);
    			num=1;
    		}
    	}
    	tmp = tmp+num+tmpChar;
    	System.out.println(tmp);
    	return tmp;
    }

    public static void main(String[] args){
    	System.out.println(countAndSay(2));
    }
}