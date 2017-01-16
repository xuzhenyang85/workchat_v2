package app.data;

import java.sql.ResultSet;
import java.sql.Statement;

import app.user.User;

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
            String query = "INSERT INTO user (name,password, email) VALUES ('" + name + "','" + password + "','" + email + "');";
            Statement stmt = new Connector().getConnection().createStatement();
            stmt.executeUpdate(query);

        } catch (Exception ex) {
        }
    }

    @Override
    public void newMessage(String msg, int userId, int roomId) {
        try {
            String query = "INSERT INTO logs " + "VALUES ('" + msg + ", " + roomId + "')";
            Statement stmt = new Connector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);
            

        } catch (Exception ex) {
        }
    }
    
    public void userLogin(String email, String password) {
        try {
            String query = "SELECT * FROM user WHERE email = '" + email + "' AND password = '" + password + "';";
            
            Statement stmt = new Connector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);
            
            if(res.next()){
                String Useremail = res.getString("email");
                String Userpassword = res.getString("password");
                System.out.println("Usermail: " + Useremail);
                System.out.println("Userpassword:" + Userpassword);
               }
            
        } catch (Exception ex) {
            
        }
    }
}
