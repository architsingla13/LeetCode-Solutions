package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author - archit.s
 * Date - 02/09/18
 * Time - 11:16 PM
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class NaryLevelOrder {

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> r = new LinkedList<>();
        Queue<Node> q = new LinkedList<>();

        if(root == null){
            return r;
        }

        q.add(root);
        while(!q.isEmpty()){
            List<Integer> l = new LinkedList<>();
            int count = q.size();
            while(count > 0){
                Node temp = q.poll();
                l.add(temp.val);
                count--;

                for(int i=0;i<temp.children.size();i++){
                    if(temp.children.get(i) != null){
                        q.add(temp.children.get(i));
                    }
                }
            }

            r.add(l);
        }

        return r;
    }
}
