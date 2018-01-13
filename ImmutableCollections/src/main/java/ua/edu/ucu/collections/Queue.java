package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList immutableLinkedList;

    public Queue() {
        immutableLinkedList = new ImmutableLinkedList();
    }

    public Queue(Object[] objects) {
        immutableLinkedList = new ImmutableLinkedList(objects);
    }

    public Object peek() {
        return immutableLinkedList.getFirst();
    }

    public Object dequeue() {
        Object temp = peek();
        immutableLinkedList = immutableLinkedList.removeFirst();
        return temp;
    }

    public void enqueue(Object e) {
        immutableLinkedList = immutableLinkedList.addLast(e);
    }
}
