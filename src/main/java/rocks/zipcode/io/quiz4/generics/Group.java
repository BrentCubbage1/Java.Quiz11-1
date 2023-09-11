package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> {

    List<_> group;
    public Group() {
        this.group = new ArrayList<>();
    }

    public Integer count() {
        return null;
    }

    public void insert(_ value) {
    }

    public Boolean has(_ value) {
        return null;
    }

    public _ fetch(int indexOfValue) {
        return null;
    }

    public void delete(_ value) {
    }

    public void clear() {
    }

    public Iterator<_> iterator() {
        return null;
    }
}
