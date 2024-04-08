package cz.landama2.database;

public interface PseudoDatabase<T> {

    boolean add(T elementToAdd);
    boolean contains(T elementToCheck);

    void printAll();
}
