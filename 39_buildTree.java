public class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
} 

public class Solution {
    /**
     *@param preorder : A list of integers that preorder traversal of a tree
     *@param inorder : A list of integers that inorder traversal of a tree
     *@return : Root of a tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
        if(preorder==null||inorder==null||preorder.length==0||inorder.length==0)
            return null;
        return buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode buildTree(int[] preorder,int preLow,int preHigh,int[] inorder,int inLow,int inHigh){
        //超出界限
        if(preLow<0||inLow<0||preLow>preorder.length-1||inLow>inorder.length-1||preLow>preHigh||inLow>inHigh)
            return null;
        TreeNode node = new TreeNode(preorder[preLow]);
        int i = inLow;
        for(; i<=inHigh; i++){
            if(inorder[i]==preorder[preLow])
                break;
        }
        node.left = buildTree(preorder,preLow+1,preLow+i-inLow,inorder,inLow,i-1);
    	node.right = buildTree(preorder,preLow+i-inLow+1,preHigh,inorder,i+1,inHigh);
        return node;
    }
}
