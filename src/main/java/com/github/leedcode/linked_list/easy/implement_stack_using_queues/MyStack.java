package com.github.leedcode.linked_list.easy.implement_stack_using_queues;

import java.util.LinkedList;
import java.util.Queue;

/** time complexity O(nk), space: O(1)
 * @author yifeng.liu
 * @date 2019-07-02 09:04
 */
public class MyStack<E> {
    Queue <Integer> q1;
    Queue <Integer> q2;

    /** Initialize your data structure here. */
    public MyStack() {
        this.q1 = new LinkedList<Integer>();
        this.q2 = new LinkedList<Integer>();

    }

    /** Push element x onto stack. */
    public void push(int x) {
        while (q1.size() != 0){
            int temp = q1.remove();
            q2.add(temp);
        }

        q1.add(x);

        while (q2.size()!=0){
            int temp2 = q2.remove();
            q1.add(temp2);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q1.remove();
    }

    /** Get the top element. */
    public int top() {
        return q1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }

}
