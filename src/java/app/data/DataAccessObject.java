package app.data;

import app.user.User;

public interface DataAccessObject {

    public User getUser(String name);

    public void createUser(String name, String password, String email);

    public void newMessage(String msg, int userId, int roomId);

    public void createGroup(String name, String password, String email);
}
