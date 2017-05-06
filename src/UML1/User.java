/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML1;

/**
 *
 * @author mybas
 */
public class User {

    private String firstName;
    private String lastName;
    private boolean enabled;
    private User user;

    public User(String firstName, String lastName, boolean enabled, String userName, String password, User user) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.enabled = enabled;
        this.user = user;
        Login login = new Login(userName, password);
    }

}
