public class Solution {
    /**
     * @param n: Given the range of numbers
     * @param k: Given the numbers of combinations
     * @return: All the combinations of k numbers out of 1..n
     */
    public List<List<Integer>> combine(int n, int k) {
		// write your code here
    	 if(n==0||k==0) return null;  
         List<List<Integer>>  res = new  ArrayList<>();  
         ArrayList<Integer> cur  = new  ArrayList<>();  
         getcombineList(n, k, 0, res, cur,1);  
         return res; 
     }

      public void getcombineList(int n,int k,int x,List<List<Integer>> res,ArrayList<Integer> cur,int start ){  
         if(x==k){  
              res.add(new ArrayList<Integer>(cur));  
              return;  
         }  
         for(int i = start;i<=n;i++){             
         	  cur.add(i);    
              getcombineList(n, k, x+1, res, cur,i+1);  
              cur.remove(cur.size()-1);  
        }  
    }   

}