public class Solution {
    /**
     * @param digits A digital string
     * @return all posible letter combinations
     */
    public ArrayList<String> letterCombinations(String digits) {
        // Write your code here
        ArrayList<String> list = new ArrayList<String>();
     	if(digits==null||digits.length()==0)
    		return list;
    	String tmp = new String();
    	getLetterCombination(digits.getCharAt(0),list,tmp,digits,0);
    	return list;
    }

     public void getLetterCombination(ArrayList<String> list,String tmp,String digits,int n){
    	if(n==digits.length()){
    		list.add(tmp);
    		return;
    	}
    	char a = digits.charAt(n);
    	int base = a-'2';
    	int len = 3;
    	if(base==7||base==5)
    		len = 4;
    	for(int i=0; i<len; i++){
    		char c = (char)('a'+base*3+i);
    		if(base==6||base==7)
    			c = (char)(c+1);
    		getLetterCombination(list,tmp+c,digits,n+1);
    	}
    }
}