package org.example;

import java.util.ListIterator;

public class TwoSidedIterator implements ListIterator<Student> {

    private int index;
    private StudentGroup group;

    public TwoSidedIterator(int index, StudentGroup group) {
        this.index = index;
        this.group = group;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Student next() {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public Student previous() {
        return null;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() { }

    @Override
    public void set(Student student) { }

    @Override
    public void add(Student student) { }
}
