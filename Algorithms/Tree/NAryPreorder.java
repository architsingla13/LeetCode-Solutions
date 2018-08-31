package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Author - archit.s
 * Date - 30/08/18
 * Time - 12:49 PM
 */
public class NAryPreorder {

    public List<Integer> preorder(Node root) {
        Stack<Node> s = new Stack<>();

        List<Integer> l = new LinkedList<>();

        if(root == null){
            return l;
        }
        s.push(root);

        while(!s.empty()){
            Node t = s.pop();
            l.add(t.val);

            List<Node> c = t.children;
            for(int i=c.size()-1;i>=0;i--){
                if(c.get(i) != null){
                    s.push(c.get(i));
                }
            }
        }

        return l;
    }
}
