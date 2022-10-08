package models;

import java.io.Serializable;

/**
 *
 * @author Kyle Helmer
 */
public class AccountService implements Serializable {

    User a = new User("abe", "password");
    User b = new User("barb", "password");

    public AccountService() {
    }

    public User login(String username, String password) {

        if (username.equals("abe") && password.equals("password")) {
            return a;
        } else if (username.equals("barb") && password.equals("password")) {
            return b;
        } else {
            return null;
        }

    }

}
