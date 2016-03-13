import java.util.ArrayList;
import java.util.List;
class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
 }
public class Solution {
    /**
     * @param root the root of binary tree
     * @param target an integer
     * @return all valid paths
     */
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // Write your code here
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        binaryTreePathSum(root,target,list,result);
        return result;
    }

    public void binaryTreePathSum(TreeNode root,int target,List<Integer> list,List<List<Integer>> result){
    	if(root==null)
    		return;
    	if(root.val == target&&root.right==null&&root.left==null){
    		list.add(root.val);
    		result.add(list);
    	}
    	else {
    		list.add(root.val);
    		ArrayList<Integer> tmp = new ArrayList<Integer>(list);
    		binaryTreePathSum(root.left,target-root.val,list,result);
    		binaryTreePathSum(root.right,target-root.val,tmp,result);
    	}
    }
}

/*对于树的问题大多通过递归的方式解决，在解决的时候要考虑的问题是对于返回边界的正确划定
理清思路，可以根据第一个要递归的点来进行判断*/