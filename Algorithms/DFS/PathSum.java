package DFS;

/**
 * Author - archit.s
 * Date - 03/09/18
 * Time - 12:36 PM
 */
public class PathSum {

    private boolean hasPathS(TreeNode r, int cur, int sum){
        if(r == null ){
            return false;
        }

        if(r.left == null && r.right == null && cur+r.val == sum){
            return true;
        }

        return hasPathS(r.left, cur+r.val, sum) || hasPathS(r.right, cur+r.val, sum);
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        return hasPathS(root,0,sum);
    }

}
