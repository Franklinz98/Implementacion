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
public class Application {
    private String description;
    private ArrayList<UserApplication> userapps;
    private ArrayList<Role> roles;

    public Application(String description, UserApplication userapp) {
        this.description = description;
        this.userapps=new ArrayList<>();
        this.userapps.add(userapp);
        this.roles=new ArrayList<>();
    }
    
}
