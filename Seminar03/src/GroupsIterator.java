package Seminar03.src;

import java.util.Iterator;

public class GroupIterator implements Iterator<StudentGroup> {
    private int counter;
    private Stream stream;

    public GroupIterator(Stream stream) {
        this.stream = stream;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < stream.groups.size() - 1;
    }

    @Override
    public StudentGroup next() {
        return stream.groups.get(counter++);
    }

}
