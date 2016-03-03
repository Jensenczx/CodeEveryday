public class Solution {
    /**
     * @param T1, T2: The roots of binary tree.
     * @return: True if T2 is a subtree of T1, or false.
     */
    public boolean isSubtree(TreeNode T1, TreeNode T2) {
        if(T2==null)
            return true;
         boolean flag = false;
        if(T1!=null&&T2!=null){
            if(T1.val==T2.val){
                flag =  isSubtree1(T1.left,T2.left)&&isSubtree1(T1.right,T2.right);
            }
            if(!flag)
                flag = isSubtree(T1.left,T2)||isSubtree(T1.right,T2);
        }
        return flag;
    }
    public boolean isSubtree1(TreeNode T1, TreeNode T2) {
        // write your code here
        if(T2==null&&T1==null)
            return true;
        else if(T2==null||T1==null)
            return false;
        if(T2.val==T1.val)
            return isSubtree1(T1.left,T2.left)&&isSubtree1(T1.right,T2.right);
        return false;     
    }
    
}
