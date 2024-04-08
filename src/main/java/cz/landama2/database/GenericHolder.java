package cz.landama2.database;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class GenericHolder<T> implements PseudoDatabase<T> {

    private final List<T> uniqueRecords = new ArrayList<>();
//    private final Set<T> uniqueRecords = new HashSet<>();

    public boolean contains(T elementToCheck) {
        return uniqueRecords.contains(elementToCheck);
    }

    public boolean add(T elementToAdd) {
        if (!contains(elementToAdd)) {
            uniqueRecords.add(elementToAdd);
            return true;
        }
        return false;
    }

    public void printAll() {
        for (T uniqueRecords : uniqueRecords) {
            System.out.println(uniqueRecords);
        }
    }
}