package cz.landama2.database;

import java.util.HashSet;
import java.util.Set;

public class StringsDatabase2 implements PseudoDatabase<String> {

    private final Set<String> uniqueStrings = new HashSet<>();

    public boolean contains(String stringToAdd) {
        return uniqueStrings.contains(stringToAdd);
    }

    public boolean add(String stringToAdd) {
        if (!contains(stringToAdd)) {
            uniqueStrings.add(stringToAdd);
            return true;
        }
        return false;
    }

    public void printAll() {
        for (String uniqueString : uniqueStrings) {
            System.out.println(uniqueString);
        }
    }
}
