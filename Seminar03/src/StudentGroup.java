package Seminar03.src;

import java.util.Iterator;

public class StudentGroup implements Iterable<Student>{

    private String nameGroup;

    public StringBuilder students = new StringBuilder();

    public StudentGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public void addStudent(Student student) {
        students.append(student).append(" ");
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public String getName() {
        return nameGroup;
    }

    @Override
    public String toString() {
        return "nameGroup: "+ nameGroup;
    }
}
