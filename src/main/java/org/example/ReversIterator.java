package org.example;

import java.util.Iterator;

public class ReversIterator implements Iterator<Student> {
    private int index;
    private StudentGroup group;

    public ReversIterator(StudentGroup group) {
        this.group = group;
        index = group.sise() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Student next() {
        return group.get(index--);
    }

}
