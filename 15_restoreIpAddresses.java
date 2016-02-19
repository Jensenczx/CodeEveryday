import java.util.ArrayList;
public class Solution {
    /**
     * @param s the IP string
     * @return All possible valid IP addresses
     */
    public static ArrayList<String> restoreIpAddresses(String s) {
        // Write your code here
        ArrayList<String> list = new ArrayList<String>();
        if(s==null||s.length()<4)
        	return list;
        String tmp = new String();
        restoreIpAddresses(s,0,1,list,tmp);
        return list;
    }

    public static void restoreIpAddresses(String s,int curIndex,int divNum,ArrayList<String>list,String tmp){
        for(int i=0; i<3; i++){
            int endIndex = curIndex+i;
            if(endIndex>=s.length())
                break;
            String sub = s.substring(curIndex,endIndex+1);
            if(isIpAddress(sub)){
                if(divNum==1)
                    restoreIpAddresses(s,curIndex+i+1,divNum+1,list,sub);
                 else if(divNum==2)
                    restoreIpAddresses(s,curIndex+i+1,divNum+1,list,tmp+"."+sub);
                else if(divNum==3){
                    if(endIndex+1>=s.length())
                        break;
                    if(isIpAddress(s.substring(endIndex+1,s.length())))
                            list.add(tmp+"."+sub+"."+s.substring(endIndex+1,s.length()));
                    }

                }
            }
        }
    public static boolean isIpAddress(String str){
        if(str.length()==0||str.length()>3)
            return false;
        if(str.charAt(0)=='0'&&str.length()>1)
            return false;
        int sum=0;
        for(int i=0; i<str.length(); i++)
            sum = sum*10+(str.charAt(i)-'0');
        if(sum>=0&&sum<=255)
            return true;
        return false;
    }

    public static void main(String[]args){
        System.out.println(restoreIpAddresses("010010"));
    }
}