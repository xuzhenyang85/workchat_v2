package app.data;

import app.user.Group;
import app.user.MessageLog;
import java.sql.ResultSet;
import java.sql.Statement;
import app.user.User;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class DAO implements DataAccessObject {

    @Override
    public User getUser(String email) {
        try {
            String query = "SELECT * FROM user WHERE email = " + email + ";";
            Statement stmt = new Connector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);
            if (res.next()) {
                int id = res.getInt("id");
                String username = res.getString("name");
                String userEmail = res.getString("email");
                User users = new User(id, username, userEmail);

                return users;
            }
            return null;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    public void createUser(String name, String password, String email) {

        try {
            String query = "INSERT INTO user (name, password, email) VALUES ('" + name + "','" + password + "','" + email + "');";
            Statement stmt = new Connector().getConnection().createStatement();
            stmt.executeUpdate(query);

        } catch (Exception ex) {
        }
    }

    @Override
    public void newMessage(String msg, String userId, int groupId) {
        java.util.Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        try {
            String query = "INSERT INTO logs (fk_userId, msg, fk_groupId, timestamp) VALUES ('" + userId + "', '" + msg + "', " + groupId + ", '" + timestamp + "');";
            Statement stmt = new Connector().getConnection().createStatement();
            stmt.executeUpdate(query);

        } catch (Exception ex) {
        }
    }

    @Override
    public void createGroup(String name, String password, String email, String userone, String usertwo, String userthree) {
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
            query = "INSERT INTO groups (fk_userId, fk_groupId) VALUES ('" + userone + "','" + id + "');";
            Statement stmt3 = new Connector().getConnection().createStatement();
            stmt3.executeUpdate(query);
            query = "INSERT INTO groups (fk_userId, fk_groupId) VALUES ('" + usertwo + "','" + id + "');";
            Statement stmt4 = new Connector().getConnection().createStatement();
            stmt4.executeUpdate(query);
            query = "INSERT INTO groups (fk_userId, fk_groupId) VALUES ('" + userthree + "','" + id + "');";
            Statement stmt5 = new Connector().getConnection().createStatement();
            stmt5.executeUpdate(query);

            System.out.println("in");

        } catch (Exception ex) {
            System.out.println("not in");
        }
    }

    public boolean checkLogin(String email, String password) {
        try {
            String query = "SELECT * FROM user WHERE email = '" + email + "' AND password = '" + password + "';";

            Statement stmt = new Connector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);

            if (res.next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {

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
                Group group = new Group(id, name);
                groups.add(group);
                System.out.println(groups);
            }
            return groups;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

    }

    public void checkAllGroups() {
        try {
            String query = "SELECT * FROM grouprooms";

            Statement stmt = new Connector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);
            ArrayList<Group> groups = new ArrayList<>();

        } catch (Exception ex) {

        }
    }

    @Override
    public ArrayList<Group> checkMyGroups(String email) {
        try {
            String query = "SELECT * FROM grouprooms INNER JOIN groups INNER JOIN user ON grouprooms.groupId = groups.fk_groupId AND user.email = groups.fk_userId WHERE user.email ='" + email + "';";
            Statement stmt = new Connector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);
            ArrayList<Group> groups = new ArrayList<>();
            while (res.next()) {
                int id = res.getInt("groupId");
                String name = res.getString("groupName");
                groups.add(new Group(id, name));

            }
            return groups;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    public ArrayList<MessageLog> getMessages(int groupId) {
        try {
            String query = "SELECT * FROM logs WHERE fk_groupId = '" + groupId + "'ORDER BY timestamp DESC;";
            Statement stmt = new Connector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);
            ArrayList<MessageLog> logs = new ArrayList<>();
            while (res.next()) {
                int id = res.getInt("id");
                String msg = res.getString("msg");
                String userId = res.getString("fk_userId");
                int fk_groupId = res.getInt("fk_groupId");
                String timestamp = res.getString("timestamp");
                logs.add(new MessageLog(id, msg, userId, fk_groupId, timestamp));
            }
            return logs;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
