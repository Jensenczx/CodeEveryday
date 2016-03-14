import java.util.ArrayList;
import java.util.List;
public class Solution {
    /**
     * @param matrix a matrix of m x n elements
     * @return an integer list
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        // Write your code here
        List<Integer> list = new ArrayList<Integer>();
        if(matrix==null||matrix.length==0||matrix[0].length==0)
        	return list;
        int low = 0,left=0,high=matrix.length-1,right=matrix[0].length-1;
        while(true){
        	for(int i=left; i<=right; i++)
        		list.add(matrix[low][i]);
        	low++;
        	if(left>right||low>high)
        		break;
        	for(int j=low; j<=high; j++)
        		list.add(matrix[j][right]);
        	right--;
        	if(left>right||low>high)
        		break;
        	for(int i=right; i>=left; i--)
        		list.add(matrix[high][i]);
        	high--;
        	if(left>right||low>high)
        		break;
        	for(int j=high; j>=low; j--)
        		list.add(matrix[j][left]);
        	left++;
        	if(left>right||low>high)
        		break;
        	
        }
        return list;
    }

    public static void main(String[]args){
    	int[][] matrix = {{1, 2, 3 }};
    	for(int i:spiralOrder(matrix))
    	System.out.println(i);

    }
}