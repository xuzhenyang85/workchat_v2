package app.data;

import app.user.Group;
import app.user.MessageLog;
import app.user.User;
import java.util.ArrayList;

public interface DataAccessObject {

    public User getUser(String name);

    public void createUser(String name, String password, String email);

    public void newMessage(String msg, int userId, int roomId);

    public void createGroup(String name, String password, String email, String userone, String usertwo, String userthree);
    
    public ArrayList<Group> checkMyGroups(String email);
    
    public ArrayList<MessageLog> getMessages(int groupId);
}
