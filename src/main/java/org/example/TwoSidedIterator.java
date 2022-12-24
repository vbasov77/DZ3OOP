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
        return index >= 0;
    }

    @Override
    public Student next() {
        return group.get(index++);
    }

    @Override
    public boolean hasPrevious() {
        return index <= 0;
    }

    @Override
    public Student previous() {
        return group.get(index--);
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
