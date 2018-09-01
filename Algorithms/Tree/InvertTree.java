package Tree;

/**
 * Author - archit.s
 * Date - 01/09/18
 * Time - 10:38 PM
 */
public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

}
