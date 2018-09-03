package DFS;

import java.util.Stack;

/**
 * Author - archit.s
 * Date - 03/09/18
 * Time - 11:27 AM
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class IncreasingOrder {

    public TreeNode increasingBST(TreeNode root) {

        Stack<TreeNode> s = new Stack<>();
        TreeNode prev= null, head= null;

        TreeNode cur = root;

        while(cur != null || !s.empty()){
            while(cur!=null){
                s.push(cur);
                cur = cur.left;
            }

            cur = s.pop();
            if(head == null){
                head = cur;
            }
            cur.left = null;
            if(prev != null){
                prev.right = cur;
            }

            prev = cur;
            cur = cur.right;
        }

        return head;
    }
}
