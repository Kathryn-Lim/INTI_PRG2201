/*
 *  PRG2201 Object-Oriented Programming JAN 2021
 *  Project - Inventory Management System
 *  Name: Kathryn Lim i21020061 INTI International University Nilai
 * 
 *  sales class
 */
package inventorymanagementver1;

/**
 *
 * @author Kathryn
 */
public class Sales extends User{
        
    public Sales(String name, int ID, String pw, char type){
        super(name,ID,pw);
        setUserType(type);    
    }
    
    public void displayInfo(){
         
    }
    
    public void setUserType(char type){
        this.userType = type;
    }
}
