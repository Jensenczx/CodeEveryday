public class Solution {
    /** 
     *@param chars: The letter array you should sort by Case
     *@return: void
     */
    public void sortLetters(char[] chars) {
        //write your code here
    	if(chars==null||chars.length==0||chars.length==1)
    		return;
    	int low = 0;
    	int high = chars.length-1;
    	sort(low,high,chars);
    }

    public void sort(int low,int high,char[] chars){
    	if(low<high){
    		int j = partition(low,high,chars);
    		sort(low,j-1,chars);
    		sort(j+1,high,chars);
    	}
    }

    public int partition(int low,int high,char[] chars){
    	int lowFlag = low;
    	int highFlag = high+1;
    	while(true){
    		while(compare(chars[low],chars[++lowFlag])) if(lowFlag==high) break;
    		while(compare(chars[--highFlag],chars[low])) if(highFlag==low) break;
    		if(lowFlag>=highFlag) break;
    		exch(lowFlag,highFlag,chars);
    	}
    	exch(low,highFlag,chars);
    	return highFlag;
    }

    private void exch(int num1,int num2,char[] chars){
    	char tmp = chars[num1];
    	chars[num1] = chars[num2];
    	chars[num2] = tmp;
    }


    //返回true表示第一个数大于第二个数，
    private boolean compare(char c1,char c2){
    	if(c1>='a'&&c2>='a')
    		return c1>c2;
    	if(c1<='Z'&&c2<='Z')
    		return c1>c2;
    	if(c1>c2)
    		return false;
    	return true;
    }
}
