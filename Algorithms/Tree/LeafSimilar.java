package Tree;

import java.util.Stack;

/**
 Author - archit.s
 Date - 18/08/18
 Time - 4:45 PM
 */

public class LeafSimilar {

    // Solution 1

    /*private void insertRemoveLeafStack(TreeNode r, ArrayList<Integer> s, boolean add, AtomicInteger index){
        if(r == null || index.intValue() == -1){
            return;
        }
        if(r.left == null && r.right == null){
            if(add){
                s.add(index.intValue(), r.val);
                index.incrementAndGet();
            }
            else{
                if(r.val == s.get(index.intValue())){
                    s.set(index.intValue(), 0);
                    index.incrementAndGet();
                }
                else{
                    index.set(-1);
                }
            }
        }
        else{
            insertRemoveLeafStack(r.left, s, add, index);
            insertRemoveLeafStack(r.right, s, add, index);
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> s = new ArrayList<>();

        if(root1 == null && root2 != null){
            return false;
        }
        if(root2 == null && root1 != null){
            return false;
        }

        AtomicInteger i = new AtomicInteger(0);
        insertRemoveLeafStack(root1, s, true, i);
        i = new AtomicInteger(0);
        insertRemoveLeafStack(root2, s, false, i);

        boolean flag = true;
        for (Integer value : s) {
            if (value != 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }*/

    private int dfs(Stack<TreeNode> s){

        while (true){

            final TreeNode pop = s.pop();

            if(pop.left != null){
                s.push(pop.left);
            }
            if(pop.right != null){
                s.push(pop.right);
            }
            if(pop.left == null && pop.right == null){
                return pop.val;
            }
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        if(root1 != null){
            s1.push(root1);
        }
        if(root2 != null){
            s2.push(root2);
        }

        while (!s1.empty() && !s2.empty()){
            if(dfs(s1) != dfs(s2)){
                return false;
            }
        }

        return s1.empty() && s2.empty();

    }
}
