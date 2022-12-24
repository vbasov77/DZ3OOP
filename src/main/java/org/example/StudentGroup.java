package org.example;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentGroup {
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public int sise() { return  students.size();}

    public Student get(int index){return students.get(index);}

    public Iterator<Student> descendingIterator(){
        return new ReversIterator(this);
    }

    public ListIterator<Student> listIterator(int index){
        return new TwoSidedIterator(index, this);
    }
}
