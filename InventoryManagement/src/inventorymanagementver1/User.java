/*
 *  PRG2201 Object-Oriented Programming JAN 2021
 *  Project - Inventory Management System
 *  Name: Kathryn Lim i21020061 INTI International University Nilai
 * 
 *  Abstract class User
 */
package inventorymanagementver1;

/**
 * abstract class User
 * @author Kathryn
 */
public abstract class User {
    protected String name;   //name of the user
    protected int id;                 //employee id of the user
    protected String password;        //login password
    protected char userType;        //userType, admin or sales  
    
    /**
     * parameterized constructor for abstract class User
     * @param name
     * @param ID
     * @param pw
     */
    public User(String name, int ID, String pw){
        setUser(name, ID, pw);
    }
    
    /**
     * private method to assign data to variables
     * @param fn
     * @param ln
     * @param ID
     * @param pw
     */
    private void setUser(String n, int ID, String pw){
        this.name = n;
        this.id= ID;
        this.password = pw;
    }
    
    //accessor methods

    public String getName(){
        return this.name;
    }
    
    public int getID(){
        return this.id;
    }
    
    protected String getPW(){
        return this.password;
    }
    
    public char getUserType(){
        return this.userType;
    }
    
    //mutator methods
    
    protected void setName(String n){
        this.name = n;
    }
    

    public abstract void setUserType(char type); //sets user type 'A' for admin and 'S' for sales
    public abstract void displayInfo(); //display name, id, and user type

  
}
