public class Solution {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        if (A == null || A.size() == 0)
        	return null;

        ArrayList<Long> result = new ArrayList(A.size());
        ArrayList<Long> forwardResult = new ArrayList(A.size());
        ArrayList<Long> backResult = new ArrayList(A.size());

        forwardResult.add((long)1);
       	for(int i = 1; i < A.size(); i++) {
       		forwardResult.add((long)forwardResult.get(i-1)*A.get(i-1));
       	}

       	backResult.add((long)1);
       	for(int j = A.size()-2; j >= 0; j--) {
       		backResult.add((long)backResult.get(A.size()-2-j)*A.get(j+1));
       	}

       	for(int i = 0; i < A.size(); i++) {
       		result.add((long)forwardResult.get(i)*backResult.get(A.size()-i-1));
       	}

       	return result;
    }
}
