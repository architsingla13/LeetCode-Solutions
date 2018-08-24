package Tree;

import java.util.*;

/**
 * Author - archit.s
 * Date - 23/08/18
 * Time - 10:58 AM
 */
public class NaryPostOrder {

    //Iterative Solution
    public List<Integer> postorder(Node root) {
        if (root == null) return Collections.emptyList();
        Stack<Node> stack = new Stack<>();
        Deque<Integer> vals = new ArrayDeque<>();
        stack.push(root);

        while (!stack.empty()) {
            Node n = stack.pop();
            vals.push(n.val);
            if (n.children.size() > 0) {
                for (Node node : n.children) {
                    stack.push(node);
                }
            }
        }
        return new ArrayList<>(vals);
    }

//    Recursive Solution
//    private void post(Node root, List<Integer> l){
//        if(root == null){
//            return;
//        }
//
//        for(int i=0;i<root.children.size();i++){
//            post(root.children.get(i), l);
//        }
//        l.add(root.val);
//    }
//
//    public List<Integer> postorder(Node root) {
//        List<Integer> l = new ArrayList<>();
//        post(root, l);
//
//        return l;
//    }
}
