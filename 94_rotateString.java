public class Solution {
    /**
     * @param str: an array of char
     * @param offset: an integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        if(str==null||str.length==0||str.length==1||offset==0)
        	return;
        int len = str.length;
        int realOffset = offset%str.length;
        char[] tmp = new char[len];
        for(int i=0; i<len; i++){
        	tmp[i] = str[getRealPos(i,length,realOffset)];
        }
        str = tmp;   
    }

    private int getRealPos(int now,int length,int offset){
    	if(offset+now<length)
    		return offset+now;
    	else{
    		return offset+now-length;
    	}
    }

    public void rotateString(char[] str, int offset) {
        // write your code here
        if(str==null||str.length==0||str.length==1||offset==0)
        	return;
        int len = str.length;
        int realOffset = offset%str.length;
       	char []tmp = new char[realOffset];
       	for(int i=len-realOffset-1,j=0;i<len; i++,j++){
       		tmp[j] = str[i];
       	} 
       	for(int i=len-1; i>=offset; i--){
       		str[i] = str[i-offset];
       	}  
       	for(int j=0; j<offset; j++){
       		
       	}
    }



}