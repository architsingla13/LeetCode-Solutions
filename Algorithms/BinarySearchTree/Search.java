package BinarySearchTree;

/**
 * Author - archit.s
 * Date - 25/08/18
 * Time - 11:36 PM
 */
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}


public class Search {

    public TreeNode searchBST(TreeNode root, int val) {

        if(root == null){
            return null;
        }

        while(true){
            if(root.val == val){
                return root;
            }
            else if(root.val < val){
                root = root.right;
            }
            else{
                root = root.left;
            }

            if(root == null){
                return null;
            }
        }

    }

}
