public class Solution {
	/**
	 * @param A : An integer array
	 * @return : An integer 
	 */
    public int singleNumberII(int[] A) {
        // write your code here
        if(A==null||A.length==0)
        	return 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<A.length; i++){
        	if(map.containsKey(A[i]){
        		map.put(A[i],map.get(A[i])+1);
        	}else{
        		map.put(A[i],1);
        	}
        }
        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
        	if(entry.getValue()==1)
        		return entry.getKey();
        }
        return 0;
    }
}