package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<AnyType> extends Group<AnyType> {

    @Override
    public void insert(AnyType value) {
        super.insert(value);
        Set<AnyType> sortPlz = new TreeSet<>(super.group);
        super.group.clear();
        super.group.addAll(sortPlz);
    }

    @Override
    public void delete(AnyType value) {
        super.delete(value);
    }

    public Integer indexOf(AnyType value) {
        return this.group.indexOf(value);
    }
}
