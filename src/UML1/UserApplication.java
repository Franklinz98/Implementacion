/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML1;

import java.util.ArrayList;

/**
 *
 * @author mybas
 */
public class UserApplication {

    private User user;
    private Application application;
    private ArrayList<Role> roles;

    public UserApplication(String startDate, String endDate, User user, Application application) {
        this.user = user;
        this.application = application;
        this.roles=new ArrayList<>();
        Period period = new Period(startDate, endDate);
    }

}
