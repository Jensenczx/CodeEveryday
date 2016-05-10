public class Solution {
    /**
     * @param n a number
     * @return Gray code
     */
    public ArrayList<Integer> grayCode(int n) {
        // Write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int end = Math.pow(2,n);
       	for(int i=0; i<end; i++){
       		list.add(i>>1^i);
       	}
 		return list;
    }
}