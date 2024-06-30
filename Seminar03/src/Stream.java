package Seminar03.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    public List<StudentGroup> groups = new ArrayList<>();

    public void addGroups(StudentGroup group){
        groups.add(group);
    }

    @Override
    public String toString() {
        return groups.toString();
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupsIterator(this);
    }



}
