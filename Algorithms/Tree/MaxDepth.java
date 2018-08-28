package Tree;

/**
 * Author - archit.s
 * Date - 27/08/18
 * Time - 10:42 PM
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {

        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right) + 1;

    }
}
