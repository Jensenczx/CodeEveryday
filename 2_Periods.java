import java.util.*;

public class Periods {
    public static long getLongest1(int n, String s) {
        // write code here
        long length = 0;
        if(n==0||s==null||s.length()==1)
        	return length;
        for(int i=1; i<s.length(); i++){
        	long tmpLength1=0;
     		for(int j=i/2; j<i; j++){
     			long tmpLength2 = 0;
     			for(int k=0; k<=j&&((j+k+1)<=i)&&(s.charAt(k)==s.charAt(j+k+1)); k++){
     				if((j+k+1)==i){
     					tmpLength2 = j+1;
     					break;
     				}
     			}
     			if(tmpLength2>0)
     				tmpLength1 = tmpLength2;
     		}
     		length+=tmpLength1;
        }
        return length;
    }

    public static long getLongest(int n,String s){
    	long length = 0;
        if(n==0||s==null||s.length()==1)
        	return length;
        for(int i=1; i<s.length(); i++){
        	for(int j=i-1; j>i/2; j--){
        		String tmpString = s.substring(0,j)+s.substring(0,j);
        		if(tmpString.substring(0,i).equals(s.substring(0,i))){
        			length += j;
        			break;
        		}
        	}
        }
        return length;
    }

    public static long getLongest2(int n,String s){
        long length=0;
        if(n==0||s==null||s.length()==1)
            return length;
        if(s.charAt(1)==s.charAt(0))
            length++;
        int [] subLength = new int [n];
        for(int i=0; i<n; i++)
            subLength[i] = 0;
        for(int i=1; i<n; i++){
            for(int j=1; j<=(i+1)&&(i+j)<n; j++){
                if(s.charAt(i+j)==s.charAt(j-1))
                    subLength[i+j] = i+1;
                else break;
            }
        }
        for(int tmp:subLength){
            System.out.println(tmp);
            length+=tmp;
        }
        return length;
    }

    public static void main(String []args){
    	System.out.println(getLongest2(8,"babababa"));
    }
    /*

    abababab
    问题进一步探索
    先前的思路是从中间开始作为其最小的重复词，然后进行开始位置和设置的中间位置之后的节点的比对，比对到最后一个节点
    如果比对成功则证明可以，找到最长的一个，但是复杂度攀升至n3，再进一步寻找规律，从每一个重复词向上攀升寻找，这样
    找到一个重复词，然后向后判断其可能成为那些子串的重复词。判断规则是，找到该子串，从零开始扫一下，扫到结尾，即可确认其是否符合。
    */
}