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
public class AssociateProfessor extends Professor{
    private final String profession;

    public AssociateProfessor(String profession, String area, int salary, int height, int weight, int sex, int age) {
        super(area, salary, height, weight, sex, age);
        this.profession = profession;
    }

}
