package cz.landama2;

import cz.landama2.database.DatabaseConnector;
import cz.landama2.database.StringsDatabase1;
import cz.landama2.database.StringsDatabase2;

import java.util.*;

public class StringsDbTestApp {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);

        DatabaseConnector databaseConnector = DatabaseConnector.getInstance();
        StringsDatabase1 stringHolderList = new StringsDatabase1();
        StringsDatabase2 stringHolderSet = new StringsDatabase2();
        databaseConnector.addDatabase(stringHolderList);
        databaseConnector.addDatabase(stringHolderSet);
        for (int i = 0; i < 10_000_000; i++) {
            if (i % 10_000 == 0) {
                System.out.println("records total:" + i);
            }
            String uuidString = UUID.randomUUID().toString();
            databaseConnector.store(uuidString);
        }
        databaseConnector.printAll();

    }
}
