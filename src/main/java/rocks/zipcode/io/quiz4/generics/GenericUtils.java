package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <AnyType extends Comparable> Iterable<? extends Iterable<AnyType>> powerSet(Set<AnyType> originalSet) {

        Set<Set<AnyType>> theSet = new LinkedHashSet<>();
        List<List<AnyType>> theList = new ArrayList<>();
        List<AnyType> array = new ArrayList<>(originalSet);

        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < originalSet.size(); j++){
                theList.add(array.subList(i, j));
            }
            theList.add(array.subList(i,array.size()));
        }

        for (int i = 0; i < theList.size(); i++){
            for (int j = i + 1; j < theList.size(); j++){
                List<AnyType> temp;
                List<AnyType> idx1 = theList.get(i);
                List<AnyType> idx2 = theList.get(j);

                if (idx1.size() < idx2.size()){
                    temp = idx1;
                    theList.set(i, idx2);
                    theList.set(j, temp);
                }
            }
        }
        theList.add(new ArrayList<>());
        return theList;












//        SortedGroup<AnyType> sortedGroup = new SortedGroup<>();
//        SortedGroup<ArrayList> setGroup = new SortedGroup<>();
//
//        for (AnyType item : originalSet){
//            sortedGroup.insert(item);
//        }
//
//        for (int i = 0; i < originalSet.size(); i++){
//            ArrayList<AnyType> tempList = new ArrayList<>();
//            for (int j = i + 1; j < originalSet.size(); j++){
//                tempList.add(sortedGroup.fetch(j));
//            }
//            setGroup.insert(tempList);
//        }
//        return (Iterable<? extends Iterable<AnyType>>) setGroup.iterator().;





//        SortedGroup theGroup = new SortedGroup();
//        List<AnyType> originalList = new ArrayList<>(originalSet);
//
//        for (int i = 0; i < originalSet.size(); i++){
//            SortedGroup<AnyType> theSet = new SortedGroup<>();
//            for (int j = i + 1; j < originalSet.size(); j++){
//                theSet.insert(originalList.get(j));
//                }
//            theGroup.insert(theSet);
//
//        }
//        //Iterable<? extends Iterable<? extends String>>
//        Iterator theResult = theGroup.iterator();
//        return theGroup;




//        Iterable<? extends Iterable<AnyType>> myPowerSet = new TreeSet<>();
//        List<AnyType> powerList = new ArrayList<>(originalSet);
//
//        for(int i = 0; i < originalSet.size(); i++){
//            Set<AnyType> tempSet = new TreeSet<>();
//            tempSet.add(powerList.get(i));
//            for (int j = i + 1; j < originalSet.size(); j++){
//
//                tempSet.add(powerList.get(j));
//            }
//            myPowerSet.
//        }
//        return myPowerSet;
    }

    public static <AnyType extends Comparable> Iterable<? extends Iterable<AnyType>> powerSet(AnyType... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

