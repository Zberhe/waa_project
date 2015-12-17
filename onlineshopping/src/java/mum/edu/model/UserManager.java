/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.edu.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Zehafta M
 */
public class UserManager {

    private static Map<String, RegisteredUsers> users = new HashMap();

    static {
        users.put("zehafta", new RegisteredUsers("zehafta", "tekie", "email", "12345", "street", "city", "state", 1234, "password"));
        users.put("bereket", new RegisteredUsers("zehafta", "tekie", "email", "12345", "street", "city", "state", 1234, "password"));
        users.put("eyob", new RegisteredUsers("zehafta", "tekie", "email", "12345", "street", "city", "state", 1234, "password"));
        users.put("ambes", new RegisteredUsers("zehafta", "tekie", "email", "12345", "street", "city", "state", 1234, "password"));

    }

    public static void addNewUser(String user, RegisteredUsers password) {

        users.put(user, password);
    }
    public static boolean verifyUser(String user, String password) {

        return users.containsKey(user) && (users.get(user).getPassword().equals(password));
    }
}
