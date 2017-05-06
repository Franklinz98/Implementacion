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
public class MastersStudent extends Student{
    private String master;

    public MastersStudent(String master, String college, int height, int weight, int sex, int age) {
        super(college, height, weight, sex, age);
        this.master = master;
    }
    
}
