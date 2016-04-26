public class Solution {
    /**
     * @param n n pairs
     * @return All combinations of well-formed parentheses
     */
    public ArrayList<String> generateParenthesis(int n) {
        // Write your code here
        List<String> result = new ArrayList<String>();
        String item = new String();
        generateString(0,0,result,item,n);
        return result;
    }

    private void generateString(int lNum,int rNum,List<String> list,String item,int goal){
    	if(lNum==goal){
    		for(int i=0; i<goal-rNum; i++){
    			item+=")";
    		}
    		list.add(new String(item));
    		return;
    	}
    	generateString(lNum+1,rNum,list,item+"(",goal);
    	if(rNum<lNum){
    		generateString(lNum,rNum+1,list,item+")",goal);
    	}
    }
}