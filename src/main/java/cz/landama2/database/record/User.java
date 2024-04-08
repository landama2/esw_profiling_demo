package cz.landama2.database.record;

import java.util.Objects;

public class User {

    private long id;

    private String userName;

    private String email;

    private String pass;

    private double balance;

    public User(long id, String userName, String email, String pass, double balance) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.pass = pass;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;


        if (!Objects.equals(userName, user.userName)) return false;
        if (!Objects.equals(email, user.email)) return false;
        if (!Objects.equals(pass, user.pass)) return false;
        if (id != user.id) return false;
        if (Double.compare(balance, user.balance) != 0) return false;
        return true;

    }

//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        result = (int) (id ^ (id >>> 32));
//        result = 31 * result + (userName != null ? userName.hashCode() : 0);
//        result = 31 * result + (email != null ? email.hashCode() : 0);
//        result = 31 * result + (pass != null ? pass.hashCode() : 0);
//        temp = Double.doubleToLongBits(balance);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//    }

    @Override
    public int hashCode() {
        int result;
        long temp;
//        result = (int) (id ^ (id >>> 32));
        result = (1 ^ (1 >>> 32));
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
//        temp = Double.doubleToLongBits(balance);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
