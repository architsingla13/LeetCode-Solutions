package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author - archit.s
 * Date - 27/08/18
 * Time - 11:00 PM
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class AverageOfLevels {

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> l = new ArrayList<>();
        if(root == null){
            return l;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 1;

        while(!q.isEmpty()){
            int temp = count;
            int num = count;
            count = 0;

            double sum = 0;
            while(temp > 0){
                temp--;
                TreeNode t = q.remove();

                if(t.left != null){
                    count++;
                    q.add(t.left);
                }
                if(t.right != null){
                    count++;
                    q.add(t.right);
                }

                sum+= t.val;
            }

            l.add(sum/(double)num);
        }

        return l;
    }
}
