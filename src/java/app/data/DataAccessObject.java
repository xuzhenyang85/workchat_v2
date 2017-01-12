package app.data;

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
public interface DataAccessObject {

    public User getUser(String name);

}
