合并排序数组 II

合并两个排序的整数数组A和B变成一个新的数组。

样例
给出 A = [1, 2, 3, empty, empty], B = [4, 5]
合并之后 A 将变成 [1,2,3,4,5]

class Solution {
   
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        if(A == null || B == null)
        	return;
        int pointer1 = m - 1;
        int pointer2 = n - 1;
        while(pointer1 >= 0 && pointer2 >= 0) {
        	if(A[pointer1] > B[pointer2]){
        		A[pointer1 + pointer2 + 1] = A[pointer1--];
        	}else {
        		A[pointer1 + pointer2 + 1] = B[pointer2--];
        	}
        }
        while(pointer2 >= 0){
        	A[pointer2] = B[pointer2--];
        }
    }
}