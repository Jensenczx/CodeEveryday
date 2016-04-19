import java.util.*;

public class Transform {
    public static String trans(String s, int n) {
        // write code here
        String result = "";
        if(s==null||n==0)
        	return result;
        String tmp = "";
        for(int i=0; i<n; i++){
        	char a = s.charAt(i);
        	if(a!=' '){
        		tmp = tmp+convert(a);
        	}else{
        		tmp += " ";
        	}
        }
        String tmps = "";
        for(int i=0; i<n; i++){
        	char a = tmp.charAt(i);
        	if(a!=' '){
        			tmps += a;
        	}else{
        		result = " "+tmps+result;
        		tmps = "";
        	}
        }
        if(!tmps.equals(""))
        	result = tmps+result;
        return result;
    }

    public static char convert(char c){
    	if(c>='a'){
    		return (char)('A'+(c-'a'));
    	}else{
    		return (char)('a'+(c-'A'));
    	}
    }

    public static void main(String[]args){
    	System.out.println(trans("Hello w",7));
    }
}