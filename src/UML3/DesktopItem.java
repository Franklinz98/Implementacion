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
public class DesktopItem {
    private String itemName;

    protected DesktopItem() {
    }

    public DesktopItem(String itemName) {
        this.itemName = itemName;
    }
    
    public void erase(){
        
    }
    public void finalize(){
        
    }

    public String getItemName() {
        return itemName;
    }
    public static void open(){
        
    }

    public void rename(String itemName) {
        this.itemName = itemName;
    }
    public int size(){
        return 0;
    }
}
