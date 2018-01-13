package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList immutableLinkedList;

    public Stack() {
        immutableLinkedList = new ImmutableLinkedList();
    }

    public Stack(Object[] objects) {
        immutableLinkedList = new ImmutableLinkedList(objects);
    }

    public Object peek() {
        return immutableLinkedList.getFirst();
    }

    public Object pop() {
        Object temp = immutableLinkedList.getFirst();
        immutableLinkedList.removeFirst();
        return temp;
    }

    public void push(Object e) {
        immutableLinkedList = immutableLinkedList.addFirst(e);
    }
}
