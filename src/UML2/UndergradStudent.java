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
public class UndergradStudent extends Student{
    private int semester;
    private final int career;

    public UndergradStudent(int semester, int career, String college, int height, int weight, int sex, int age) {
        super(college, height, weight, sex, age);
        this.semester = semester;
        this.career = career;
    }
    
}
