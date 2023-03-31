package org.example.stack;

import java.util.LinkedList;
import java.util.List;

public class LinkedStacks<T> implements Stack<T>{

    List<T> stack;

    public LinkedStacks() {
        stack = new LinkedList<>();
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public void push(T item) {

    }

    @Override
    public int search(T t) {
        return 0;
    }
}
