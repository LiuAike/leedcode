package com.github.leedcode.linked_list.easy.implement_queue_using_stacks;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> inStack = new Stack<Integer>();
    private Stack<Integer> outStack = new Stack<Integer>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty())
                outStack.push(inStack.pop());
        }
        return outStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (!outStack.isEmpty()) {
            return outStack.peek();
        } else {
            while (!inStack.isEmpty())
                outStack.push(inStack.pop());
        }
        return outStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}
