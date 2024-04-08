package cz.landama2;

import cz.landama2.database.DatabaseConnector;
import cz.landama2.database.UserDatabase;
import cz.landama2.database.record.User;
import cz.landama2.database.record.UserDbWrapper;

import java.util.Random;
import java.util.UUID;

public class UserDbTestApp {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);

        DatabaseConnector databaseConnector = DatabaseConnector.getInstance();
        databaseConnector.addDatabase(new UserDatabase());
        for (int i = 0; i < 10_000_000; i++) {
//        for (int i = 0; i < 500_000; i++) {
            if (i % 10_000 == 0) {
                System.out.println("records total:" + i);
            }
            String uuidString = UUID.randomUUID().toString();
            User user = createUser(i, uuidString);
            UserDbWrapper userDbWrapper = createUserDbWrapper(i, uuidString);
            databaseConnector.store(user);
            databaseConnector.store(userDbWrapper);
        }
//        databaseConnector.printAll();

    }

    private static User createUser(int i, String uuidString) {
        return new User(i, uuidString, uuidString, uuidString, new Random().nextDouble());
    }

    private static UserDbWrapper createUserDbWrapper(int i, String uuidString) {
        return new UserDbWrapper(i, uuidString, uuidString, uuidString, new Random().nextDouble());
    }
}
