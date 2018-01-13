package ua.edu.ucu.collections.immutable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class ImmutableLinkedList implements ImmutableList {
    private LinkedList<Object> linkedList;

    public ImmutableLinkedList() {
        linkedList = new LinkedList<>();
    }

    public ImmutableLinkedList(Object[] objects) {
        linkedList = new LinkedList<>(Arrays.asList(objects));
    }

    public ImmutableLinkedList(LinkedList<Object> objects) {
        linkedList = new LinkedList<>(objects);
    }

    @Override
    public ImmutableLinkedList add(Object e) {
        LinkedList<Object> newLinkedList = new LinkedList<>(linkedList);
        newLinkedList.add(e);
        return new ImmutableLinkedList(newLinkedList);
    }

    @Override
    public ImmutableLinkedList add(int index, Object e) {
        LinkedList<Object> newLinkedList = new LinkedList<>(linkedList);
        newLinkedList.add(index, e);
        return new ImmutableLinkedList(newLinkedList);
    }

    @Override
    public ImmutableLinkedList addAll(Object[] c) {
        LinkedList<Object> newLinkedList = new LinkedList<>(linkedList);
        newLinkedList.addAll(Arrays.asList(c));
        return new ImmutableLinkedList(newLinkedList);
    }

    @Override
    public ImmutableLinkedList addAll(int index, Object[] c) {
        LinkedList<Object> newLinkedList = new LinkedList<>(linkedList);
        newLinkedList.addAll(index, Arrays.asList(c));
        return new ImmutableLinkedList(newLinkedList);
    }

    public ImmutableLinkedList addFirst(Object e) {
        LinkedList<Object> newLinkedList = new LinkedList<>(linkedList);
        newLinkedList.addFirst(e);
        return new ImmutableLinkedList(newLinkedList);
    }

    public ImmutableLinkedList addLast(Object e) {
        return add(e);
    }

    @Override
    public Object get(int index) {
        return linkedList.get(index);
    }

    public Object getFirst() {
        return linkedList.getFirst();
    }

    public Object getLast() {
        return linkedList.getLast();
    }

    @Override
    public ImmutableLinkedList remove(int index) {
        LinkedList<Object> newLinkedList = new LinkedList<>(linkedList);
        newLinkedList.remove(index);
        return new ImmutableLinkedList(newLinkedList);
    }

    public ImmutableLinkedList removeFirst() {
        LinkedList<Object> newLinkedList = new LinkedList<>(linkedList);
        newLinkedList.removeFirst();
        return new ImmutableLinkedList(newLinkedList);
    }

    public ImmutableLinkedList removeLast() {
        LinkedList<Object> newLinkedList = new LinkedList<>(linkedList);
        newLinkedList.removeLast();
        return new ImmutableLinkedList(newLinkedList);
    }

    @Override
    public ImmutableLinkedList set(int index, Object e) {
        LinkedList<Object> newLinkedList = new LinkedList<>(linkedList);
        newLinkedList.set(index, e);
        return new ImmutableLinkedList(newLinkedList);
    }

    @Override
    public int indexOf(Object e) {
        return linkedList.indexOf(e);
    }

    @Override
    public int size() {
        return linkedList.size();
    }

    @Override
    public ImmutableLinkedList clear() {
        return new ImmutableLinkedList();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public Object[] toArray() {
        return linkedList.toArray();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}
