/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML2;

/**
 *
 * @author mybas
 */
public class Citizen extends Person {
    private String city;

    public Citizen(String city, int height, int weight, int sex, int age) {
        super(height, weight, sex, age);
        this.city = city;
    }
       
}
