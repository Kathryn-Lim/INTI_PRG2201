/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementver1;

/**
 *
 * @author ASUS
 */
public class Category {

    /**
     * @param args the command line arguments
     */
    private int id;
    private String name;
    
    public Category(int id, String name)
    {
        setCategory(id, name);
    }
    
    private void setCategory(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
}
