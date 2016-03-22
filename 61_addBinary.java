public class Solution {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public String addBinary(String a, String b) {
        // Write your code here
        if(a==null&&b==null)
        	return null;
        int lenA = a.length();
        int lenB = b.length();
        int cur=0;
        int pre=0;
        int min=Min(lenA,lenB);
        StringBuilder result = new StringBuilder("");
        int i=1;
        while(i<=min){
        	cur = (a.charAt(lenA-i)-'0'+b.charAt(lenB-i)-'0'+pre)%2;
        	pre = (a.charAt(lenA-i)-'0'+b.charAt(lenB-i)-'0'+pre)/2;
            result.insert(0,cur);
        	i++;
        }
        if(lenA-min>0){
        	i = lenA-min-1;
        	while(i>=0){
        		cur = (a.charAt(i)-'0'+pre)%2;
        		pre = (a.charAt(i)-'0'+pre)/2;
                result.insert(0,cur);
        		i--;
        	}
        }else if(lenB-min>0){
        	i = lenB-min-1;
        	while(i>=0){
        		cur = (b.charAt(i)-'0'+pre)%2;
        		pre = (b.charAt(i)-'0'+pre)/2;
                result.insert(0,cur);
        		i--;
        	}

        }
        if(pre!=0)
            result.insert(0,pre);
        return result.toString();
    }

    public int Min(int num1,int num2){
    	return num1<num2?num1:num2;
    }
}