package org.example;

import java.util.Stack;

public class PilhaObj<T> {
    private Stack<T> stack = new Stack<>();

    public void push(T obj) {
        stack.push(obj);
    }

    public T pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}