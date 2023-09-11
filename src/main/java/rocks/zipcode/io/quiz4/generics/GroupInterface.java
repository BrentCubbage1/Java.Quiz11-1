package rocks.zipcode.io.quiz4.generics;

/**
 * @author leon on 18/12/2018.
 */
public interface GroupInterface<AnyType> extends Iterable<AnyType> {
    Integer count();
    Boolean has(AnyType valueToInsert);
    AnyType fetch(int indexOfValue);
    void insert(AnyType string);
    void delete(AnyType valueToInsert);
    void clear();
}
