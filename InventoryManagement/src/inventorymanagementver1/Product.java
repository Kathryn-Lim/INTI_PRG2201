/*
 *  PRG2201 Object-Oriented Programming JAN 2021
 *  Project - Inventory Management System
 *  Name: Kathryn Lim i21020061 INTI International University Nilai
 * 
 *  Test file for product class
 */
package inventorymanagementver1;

/**
 *
 * @author Kathryn
 */
public class Product {
    private int ID;
    private String name;
    private String desc;
    private String category;
    private int qty;
    
    
    public Product(){
        //idk default constructor
    }
    
    /**
     * Parameterized constructor to create and set values for product
     * 
     * @param id
     * @param n
     * @param d
     * @param cat
     * @param q 
     */
    public Product(int id, String n, String d, String cat, int q){
        
        setID(id);
        setName(n);
        setDesc(d);
        setCategory(cat);
        setQty(q);           
    }
    
    public int getID(){
        return this.ID;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDesc(){
        return this.desc;
    }
    
    public String getCat(){
        return this.category;
    }
    
    public int getQty(){
        return this.qty;
    }
    
    public void setID(int id){
        this.ID = id;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public void setDesc(String d){
        this.desc = d;
    }
    
    public void setCategory(String cat){
        this.category = cat;
    }
    
    public void setQty(int q){
        this.qty = q;
    }
    
    /**
     * Places data members into an array, returns the array to display onto the stock table.
     * 
     * @return data array 
     */
    public String[] getData(){
        String data[] = {String.valueOf(this.ID), this.name, this.desc, this.category, String.valueOf(this.qty)};
        
        return data;
    }
    
    

}
