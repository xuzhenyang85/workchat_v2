package app.data;

import java.sql.ResultSet;
import java.sql.Statement;

import app.user.User;

public class DAO implements DataAccessObject {

    @Override
    public User getUser(String name) {
        try {
            String query = "SELECT * FROM user WHERE name = " + name + ";";
            Statement stmt = new Connector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);
            if (res.next()) {
                int id = res.getInt("id");
                String username = res.getString("name");
                String email = res.getString("email");
                User users = new User(id, username, email);

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
            Statement stmt = new Connector().getConnection().createStatement();
            String query = "INSERT INTO user (name, password, email) VALUES ('" + name + "','" + password + "','" + email + "');";
            stmt.executeUpdate(query);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void newMessage(String msg, int userId, int roomId) {
        try {
            String query = "INSERT INTO logs " + "VALUES ('" + msg + "," + userId + ", " + roomId + "')";
            Statement stmt = new Connector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
