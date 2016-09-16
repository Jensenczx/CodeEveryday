给定一个整数数组A。

定义B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]，
计算B的时候请不要使用除法。
样例
给出A=[1, 2, 3]，返回 B为[6, 3, 2]
public class Solution {
   
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
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
