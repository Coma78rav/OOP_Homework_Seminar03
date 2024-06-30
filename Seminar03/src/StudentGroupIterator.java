package Seminar03.src;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {

    private int index;
    private StudentGroup studentGroup;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < getStudents().length;
    }

    @Override
    public Student next() {
        Student[] students = getStudents();
        return students[index++];
    }
    private Student[] getStudents() {
        String[] names = studentGroup.students.toString().split(" ");
        Student[] students = new Student[names.length];

        int count = 0;
        for(String name: names) {
            students[count] = new Student(name, count);
            count++;
        }
        return students;
    }
}
