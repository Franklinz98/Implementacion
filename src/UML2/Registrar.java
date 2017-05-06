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
public class Registrar extends Employee{
    private final String profession;

    public Registrar(String profession, int salary, int height, int weight, int sex, int age) {
        super(salary, height, weight, sex, age);
        this.profession = profession;
    }
    
}
