public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Level order a list of lists of integer
     */

    //迭代实现
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
      ArrayList<ArrayList<Integer>> traverResult = new ArrayList<ArrayList<Integer>>();
      if(root==null)
        return traverResult;
      ArrayList<TreeNode> nodeQueue = new ArrayList<TreeNode>();
      nodeQueue.add(root);
      while(nodeQueue.size()!=0){
        traverResult.add(getSeriesOfLevel(nodeQueue));
        ArrayList<TreeNode>tmpList = new ArrayList<TreeNode>();
        for(TreeNode node:nodeQueue){
          if(node.left!=null)
            tmpList.add(node.left);
          if(node.right!=null)
            tmpList.add(node.right);
        }
        nodeQueue.removeAll(nodeQueue);
        nodeQueue.addAll(tmpList);
        } 
      return traverResult;
    }
    public ArrayList<Integer> getSeriesOfLevel(ArrayList<TreeNode> level){
      ArrayList<Integer> series = new ArrayList<Integer>();
      for(TreeNode node:level)
        series.add(node.val);
      return series;
    }
//递归实现
    public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(root==null)
          return list;
        ArrayList<TreeNode> tmp = new ArrayList<TreeNode>();
        tmp.add(root);
        traverTheTree(tmp,list);
    }

    public void traverTheTree(List<TreeNode> list,ArrayList<ArrayList<Integer>> result){
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        ArrayList<TreeNode> tmpNode = new ArrayList<TreeNode>();
        for(int i=0; i<list.size(); i++){
          TreeNode node = list.get(i);
          if(node.left!=null)
            tmpNode.add(node.left);
          if(node.right!=null)
            tmpNode.add(node.right);
          tmp.add(node.val);
        }
        if(tmp.size()>0)
        result.add(tmp);
      traverTheTree(tmpNode,result);
    }
  
}


}