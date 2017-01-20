/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.data;

import app.user.MessageLog;
import app.user.User;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danny
 */
public class DAOTest {

    public DAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getUser method, of class DAO.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String email = "";
        DAO instance = new DAO();
        User expResult = instance.getUser(email);
        User result = instance.getUser(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of createUser method, of class DAO.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        String name = "Peter";
        String password = "Peter";
        String email = "Peter@email.dk";
        DAO instance = new DAO();
        instance.createUser(name, password, email);
    }

    /**
     * Test of newMessage method, of class DAO.
     */
    @Test
    public void testNewMessage() {
        System.out.println("newMessage");
        String msg = "";
        String userId = "";
        int roomId = 0;
        DAO instance = new DAO();
        instance.newMessage(msg, userId, roomId);
    }

    /**
     * Test of createGroup method, of class DAO.
     */
    @Test
    public void testCreateGroup() {
        System.out.println("createGroup");
        String name = "";
        String password = "";
        String email = "";
        String userone = "";
        String usertwo = "";
        String userthree = "";
        DAO instance = new DAO();
        instance.createGroup(name, password, email, userone, usertwo, userthree);
    }

    /**
     * Test of checkLogin method, of class DAO.
     */
    @Test
    public void testCheckLogin() {
        System.out.println("createUser");
        String name = "Peter";
        String password = "Peter";
        String email = "Peter@email.dk";
        DAO instance = new DAO();
        instance.createUser(name, password, email);
        
        System.out.println("checkLogin");
        email = "Peter@email.dk";
        password = "Peter";
        boolean expResult = true;
        boolean result = instance.checkLogin(email, password);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkAllGroups method, of class DAO.
     */
    @Test
    public void testCheckAllGroups() {
        System.out.println("checkAllGroups");
        DAO instance = new DAO();
        instance.checkAllGroups();
    }
}
