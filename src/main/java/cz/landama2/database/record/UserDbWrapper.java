package cz.landama2.database.record;

public class UserDbWrapper extends User {


    public UserDbWrapper(long id, String userName, String email, String pass, double balance) {
        super(id, userName, email, pass, balance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;

        return getId() == user.getId();
    }
}
