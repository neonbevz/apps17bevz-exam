package ua.edu.ucu.collections.immutable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ImmutableArrayList implements ImmutableList {
    private ArrayList<Object> arrayList;

    public ImmutableArrayList() {
        arrayList = new ArrayList<>();
    }

    public ImmutableArrayList(Object[] objects) {
        arrayList = new ArrayList<>(Arrays.asList(objects));
    }

    public ImmutableArrayList(ArrayList<Object> objects) {
        arrayList = new ArrayList<>(objects);
    }

    @Override
    public ImmutableArrayList add(Object e) {
        ArrayList<Object> newArrayList = new ArrayList<>(arrayList);
        newArrayList.add(e);
        return new ImmutableArrayList(newArrayList);
    }

    @Override
    public ImmutableArrayList add(int index, Object e) {
        ArrayList<Object> newArrayList = new ArrayList<>(arrayList);
        newArrayList.add(index, e);
        return new ImmutableArrayList(newArrayList);
    }

    @Override
    public ImmutableArrayList addAll(Object[] c) {
        ArrayList<Object> newArrayList = new ArrayList<>(arrayList);
        newArrayList.addAll(Arrays.asList(c));
        return new ImmutableArrayList(newArrayList);
    }

    @Override
    public ImmutableArrayList addAll(int index, Object[] c) {
        ArrayList<Object> newArrayList = new ArrayList<>(arrayList);
        newArrayList.addAll(index, Arrays.asList(c));
        return new ImmutableArrayList(newArrayList);
    }

    @Override
    public Object get(int index) {
        return arrayList.get(index);
    }

    @Override
    public ImmutableArrayList remove(int index) {
        ArrayList<Object> newArrayList = new ArrayList<>(arrayList);
        newArrayList.remove(index);
        return new ImmutableArrayList(newArrayList);
    }

    @Override
    public ImmutableArrayList set(int index, Object e) {
        ArrayList<Object> newArrayList = new ArrayList<>(arrayList);
        newArrayList.set(index, e);
        return new ImmutableArrayList(newArrayList);
    }

    @Override
    public int indexOf(Object e) {
        return arrayList.indexOf(e);
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public ImmutableArrayList clear() {
        return new ImmutableArrayList();
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public Object[] toArray() {
        return arrayList.toArray();
    }

    @Override
    public String toString() {
        return arrayList.toString();
    }
}
