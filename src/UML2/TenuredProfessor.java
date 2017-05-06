/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML2;

import java.util.ArrayList;

/**
 *
 * @author mybas
 */
public class TenuredProfessor extends Professor{
    ArrayList<AssociateProfessor> SubordinateProfessors;

    public TenuredProfessor(String area, int salary, int height, int weight, int sex, int age) {
        super(area, salary, height, weight, sex, age);
        this.SubordinateProfessors=new ArrayList<>();
    }
    
}
