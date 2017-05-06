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
public abstract class Person {

    private final int height;
    private int weight;
    private final int sex;
    private int age;

    public Person(int height, int weight, int sex, int age) {
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.age = age;
    }
}
