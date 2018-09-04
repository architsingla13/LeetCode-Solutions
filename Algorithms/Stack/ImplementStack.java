package Stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author - archit.s
 * Date - 05/09/18
 * Time - 12:07 AM
 */
public class ImplementStack {
    class MyStack {

        private Queue<Integer> q;
        /** Initialize your data structure here. */
        public MyStack() {
            q = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            q.add(x);
            for(int i=0;i<q.size()-1;i++){
                int top = q.poll();
                q.add(top);
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return q.poll();
        }

        /** Get the top element. */
        public int top() {
            return q.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return q.isEmpty();
        }
    }
}
