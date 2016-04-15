/**
 * public class SVNRepo {
 *     public static boolean isBadVersion(int k);
 * }
 * you can use SVNRepo.isBadVersion(k) to judge whether 
 * the kth code version is bad or not.
*/
class Solution {
    /**
     * @param n: An integers.
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
        // write your code here
         if(n<=1)
        	return 1;
        return findFirstBadVersion(1,n);
    }
    
     public int findFirstBadVersion(int start, int end){
    	if(start==end){
    		if(SVNRepo.isBadVersion(start))
    			return start;
    		else return 0;
    	}
    	int mid = (start+end)/2;
    	if(SVNRepo.isBadVersion(mid)){
    		if(mid-1>=start&&!SVNRepo.isBadVersion(mid-1))
    			return mid;
    		else
    			return findFirstBadVersion(start,mid-1);
    	}else{
    		if(mid+1<=end&&SVNRepo.isBadVersion(mid+1))
    			return mid+1;
    		else return findFirstBadVersion(mid+1,end);
    	}

    }
}
