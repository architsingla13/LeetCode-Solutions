package Tree;

import java.util.List;

/**
 * Author - archit.s
 * Date - 21/08/18
 * Time - 12:43 PM
 */

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class MaxDepthNAry {

    public int maxDepth(Node root) {

        int depth = 0;
        if(root == null){
            return 0;
        }
        for(int i=0;i<root.children.size();i++){
            depth = Math.max(depth, maxDepth(root.children.get(i)));
        }

        return depth + 1;
    }

}
