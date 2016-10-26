class Solution {
    /**
     * Get all distinct N-Queen solutions
     * @param n: The number of queens
     * @return: All distinct solutions
     * For example, A string '...Q' shows a queen on forth position
     */
    ArrayList<ArrayList<String>> solveNQueens(int n) {
        // write your code here
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
    	boolean[][] table = new boolean[n][n];
    	for(int i = 0; i < n; i++){
    		table[0][i] = true;
    		ArrayList<String> tmp = new ArrayList();
    		tmp.add(getContent(n,i));
    		solveNQueens(n, 1, tmp, result, table);
    		table[0][i] = false;
    	}
  		return result;
    }

   	void solveNQueens(int n, int leveal,ArrayList<String> list, ArrayList<ArrayList<String>> result,boolean[][] table){
   		if(leveal == n){
   			result.add(list);
   			return;
   		}
   		for(int i = 0; i < n; i++){
   			if(checkIsMark(table, leveal, i, n)){
   				continue;
   			}else{
   				ArrayList<String> tmp = new ArrayList(list);
   				tmp.add(getContent(n,i));
   				table[leveal][i] = true;
   				solveNQueens(n, leveal+1, tmp, result, table);
   				table[leveal][i] = false;
   			}
   		}
   	}

   	boolean checkIsMark(boolean[][] table, int x, int y, int n){
   		for(int i = 1; i <= x; i++){
   			if(table[x-i][y])
   				return true;
   			if((y-i) >= 0 && table[x-i][y-i])
   				return true;
   			if((y+i) < n && table[x-i][y+i])
   				return true;
   		}
   		return false;
   	}

   	String getContent(int n, int index){
   		String tmp = new String();
   		for(int i = 0; i < n; i++){
   			if(i != index)
   				tmp = tmp + ".";
   			else
   				tmp = tmp + "Q";
   		}
   		return tmp;
   	}
};