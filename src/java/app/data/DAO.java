package app.data;

import app.user.Group;
import java.sql.ResultSet;
import java.sql.Statement;
import app.user.User;
import java.util.ArrayList;

public class DAO implements DataAccessObject
{

    @Override
    public User getUser(String email)
    {
        try
        {
            String query = "SELECT * FROM user WHERE email = " + email + ";";
            Statement stmt = new Connector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);
            if (res.next())
            {
                int id = res.getInt("id");
                String username = res.getString("name");
                String userEmail = res.getString("email");
                User users = new User(id, username, userEmail);

                return users;
            }
            return null;
        } catch (Exception ex)
        {
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    public void createUser(String name, String password, String email)
    {

        try {
            String query = "INSERT INTO user (name, password, email) VALUES ('" + name + "','" + password + "','" + email + "');";
            Statement stmt = new Connector().getConnection().createStatement();
            stmt.executeUpdate(query);

        } catch (Exception ex)
        {
        }
    }

    @Override
    public void newMessage(String msg, int userId, int roomId) {
        try {
            String query = "INSERT INTO logs " + "VALUES ('" + msg + "', '" + roomId + "')";
            Statement stmt = new Connector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);

        } catch (Exception ex) {
        }
    }

    @Override
    public void createGroup(String name, String password, String email) {
        try {

            String query = "INSERT INTO grouprooms (groupName, groupPassword, groupEmail) VALUES ('" + name + "','" + password + "','" + email + "');";
            Statement stmt = new Connector().getConnection().createStatement();
            stmt.executeUpdate(query);

            query = "SELECT * FROM grouprooms WHERE groupName = '" + name + "' AND groupPassword = '" + password + "';";
            Statement stmt1 = new Connector().getConnection().createStatement();
            ResultSet res = stmt1.executeQuery(query);
            
            int id = 0;
            if (res.next()) {
                id = res.getInt("groupId");
            }

            query = "INSERT INTO groups (fk_userId, fk_groupId) VALUES ('" + email + "','" + id + "');";
            Statement stmt2 = new Connector().getConnection().createStatement();
            stmt2.executeUpdate(query);

            System.out.println("finish");

        } catch (Exception ex) {
            System.out.println("hello");
        }
    }

    public boolean checkLogin(String email, String password)
    {
        try
        {
            String query = "SELECT * FROM user WHERE email = '" + email + "' AND password = '" + password + "';";

            Statement stmt = new Connector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);

            if (res.next())
            {
                return true;
            } else
            {
                return false;
            }

        } catch (Exception ex)
        {

        }
        return false;
    }

    public ArrayList<Group> getAllGroups() {
        ArrayList<Group> groups = new ArrayList<>();

        try {
            String query = "SELECT * FROM grouprooms";

            Statement stmt = new Connector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);

            while (res.next()) {
                int id = res.getInt("groupId");
                String name = res.getString("groupName");
                Group group = new Group(id,name); 
                groups.add(group);
            }
            return groups;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

    }

    public void sendInvitation() {

    }

    public void seeInvitation() {

    }

    public void acceptInvitation() {
        
    }

    public void checkAllGroups(String fk_userId, int fk_groupId) {
        try {
            String query = "SELECT * FROM groups WHERE fk_userId = '" + fk_userId + "' AND fk_groupId = '" + fk_groupId + "';";
            
        } catch (Exception ex) {
            
        }
    }
    @Override
    public ArrayList<Group> checkMyGroups(String email)
    {
        try
        {
            String query = "SELECT * FROM grouprooms INNER JOIN groups INNER JOIN user ON grouprooms.groupId = groups.fk_groupId AND user.id = groups.fk_userId WHERE user.email ='"+email+"';";
            Statement stmt = new Connector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);
            ArrayList<Group> groups = new ArrayList<>();
            while (res.next())
            {
                int id = res.getInt("groupId");
                String name = res.getString("groupName");
//                String groupPassword = res.getString("groupPassword");
//                String groupEmail = res.getString("groupEmail");
//                int userId = res.getInt("fk_userId");
//                int groupId = res.getInt("fk_groupId");
                //måske lave alt om til setters og kun sende name over som førhen. MÅSKE.. :) - kan være vi skal se på det imorgen hvad der er bedst for os?
                groups.add(new Group(id, name));

            }
            return groups;
        } catch (Exception ex)
        {
            ex.printStackTrace();
            return null;
        }

    }
}
