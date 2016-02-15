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
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        // Write your code here
        List<String> list = new ArrayList<String> ();
 		String str = new String();
        traveTree(root,str,list);
        return list;
    }

    public void traveTree(TreeNode root,String str,List<String> list){
    	if(root==null)
    		return;
    	if(root.left==null&&root.right==null){
    		if(str.length()>0)
    			list.add(str+"->"+root.val);
    		else list.add(root.val+"");
    	}
    	else{
    		if(str.length()>0)
    			str = str+"->"+root.val;
    		else str = root.val+"";
    		String tmp = new String(str);
    		traveTree(root.left,str,list);
    		traveTree(root.right,tmp,list);
    	}

    }

    public static void main(String[]args){

    }
}