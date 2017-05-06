/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML3;

import java.util.ArrayList;

/**
 *
 * @author mybas
 */
public class Folder extends DesktopItem implements Group{

    private ArrayList<DesktopItem> items;

    public void add(DesktopItem ditem) {
        this.items.add(ditem);
    }

    public void erase() {
        super.erase();
    }

    public void finalize() {
        super.finalize();
    }

    public Folder(String itemName) {
        super(itemName);
        this.items = new ArrayList<>();
    }

    private Folder(){
        
    }
    
    public static void open(){
    }
    
    public int size(){
        return super.size();
    }
}
