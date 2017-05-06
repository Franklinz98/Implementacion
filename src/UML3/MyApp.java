/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML3;

/**
 *
 * @author mybas
 */
public class MyApp {

    private static String itemName;
    private static Folder folder = new Folder(itemName);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        folder.open();
    }

}
