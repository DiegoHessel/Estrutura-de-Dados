package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class FilaObj<T> {
    private Queue<T> queue = new LinkedList<>();

    public void enqueue(T obj) {
        queue.add(obj);
    }

    public T dequeue() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}