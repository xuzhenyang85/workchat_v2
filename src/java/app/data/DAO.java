package app.data;

import java.sql.ResultSet;
import java.sql.Statement;

import app.user.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author danny
 */
public class DAO implements DataAccessObject {

    @Override
    public User getUser(String name) {
        try {
            String query = "SELECT * FROM workchat.user WHERE name = " + name + ";";
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
            return null;
        }

    }

    @Override
    public void login(String email, String password) {
        try {
            String query = "SELECT * FROM workchat.user WHERE email = " + email + " AND password = " + password + ";";
            Statement stmt = new Connector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);

            if (res.next()) {
//                String email = res.getString(email);
//                String password = res.getString(password);
            }

        } catch (Exception ex) {
        }

    }

}
