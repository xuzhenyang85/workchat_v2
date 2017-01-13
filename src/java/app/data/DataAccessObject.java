package app.data;

import app.user.User;

public interface DataAccessObject {

    public User getUser(String name);
    public void createUser(String name, String password, String email);
}
