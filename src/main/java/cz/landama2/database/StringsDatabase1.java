package cz.landama2.database;

import java.util.ArrayList;
import java.util.List;

public class StringsDatabase1 implements PseudoDatabase<String> {

    private final List<String> uniqueStrings = new ArrayList<>();

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