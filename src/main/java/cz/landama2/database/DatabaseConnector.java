package cz.landama2.database;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DatabaseConnector {

    private static DatabaseConnector INSTANCE;
    private List<PseudoDatabase> databases = new ArrayList<>();

    public DatabaseConnector() {
        init();
    }

    public void addDatabase(PseudoDatabase pseudoDatabase) {
        databases.add(pseudoDatabase);
    }
    private void init() {

    }

    public void store(Object stringToStore) {
        for (PseudoDatabase database : databases) {
            database.add(stringToStore);
        }
    }

    public void printAll() {
        for (PseudoDatabase database : databases) {
            database.printAll();
        }
    }

    public static synchronized DatabaseConnector getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseConnector();
        }
        return INSTANCE;
    }
}