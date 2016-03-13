public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Postorder in ArrayList which contains node values.
     */

    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        postorderTraversal(root,result);
        return result;
    }

    public void postorderTraversal(TreeNode root,ArrayList<Integer> result){
        if(root==null)
            return;
        else{
            postorderTraversal(root.left,result);
            postorderTraversal(root.right,result);
            result.add(root.val);
        }
    }
}