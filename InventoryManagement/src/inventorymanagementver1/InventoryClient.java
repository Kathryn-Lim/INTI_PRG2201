/**
 * PRG2201 Object-Oriented Programming JAN 2021
 * Project - Inventory Management System
 * Name: Kathryn Lim i21020061 INTI International University Nilai
 * 
 * Main method for inventory system. Displays sign up page upon startup
 */

package inventorymanagementver1;


public class InventoryClient {
    public static void main(String[] args) {
        UserReg.signupPage.setLocationRelativeTo(null);
        UserReg.signupPage.setVisible(true);   //displays sign up page upon startup
        UserReg.signupPage.clearFields();
    }
    
}

