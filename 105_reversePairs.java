public class Solution {
    /**
     * @param A an array
     * @return total of reverse pairs
     */
    public long reversePairs(int[] A) {
        // Write your code here
        if(A==null||A.length<=1)
        	return 0;
        int len = A.length;
        long result = 0;
        for(int i=0; i<len-1; i++){
        	for(int j=i+1; j<len; j++){
        		if(A[j]<A[i])
        			result++;
        	}
        }
        return result;
    }

    private int[] aux = null;

    public long reversePairs(int[] A){
    	if(A==null||A.length<=1)
        	return 0;
        int len = A.length;
        aux = new int[len];
        return sort(A,0,len-1);
    }

    private long sort(int[] array,int low,int high){
    	long count = 0;
		if(low>=high)
			return count;
		int mid = low+(high-low)/2;
		count+=sort(array,low,mid);
		count+=sort(array,mid+1,high);
		count+=merge(array,low,mid,high);
		return count;
	}

	private count merge(int[] array,int low,int mid,int high){
		long count = 0;
		int i=low,j=mid+1;
		for(int k=low; k<=high; k++)
			aux[k]=array[k];
		for(int k=low; k<=high; k++){
			if(i>mid) array[k]=aux[j++];
			else if(j>high) array[k]=aux[i++];
			else if(aux[i]>aux[j]){
				array[k]=aux[j++];
				count += (mid-i)+1;
			} 
			else array[k]=aux[i++];
		}
		return count;
	}
}