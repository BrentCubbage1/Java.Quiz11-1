package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<AnyType> implements GroupInterface<AnyType>{

    List<AnyType> group;
    public Group() {
        this.group = new ArrayList<>();
    }

    public Integer count() {
        Integer count = 0;
        for(AnyType items : group){
            count++;
        }
        return count;
    }

    public void insert(AnyType value) {
        this.group.add(value);
    }

    public Boolean has(AnyType value) {
        return this.group.contains(value);
    }

    public AnyType fetch(int indexOfValue) {
        return this.group.get(indexOfValue);
    }

    public void delete(AnyType value) {
        this.group.remove(value);
    }

    public void clear() {
        this.group.clear();
    }

    public Iterator<AnyType> iterator() {
        return this.group.iterator();
    }

    @Override
    public String toString() {
        return this.group.toString();
    }
}
