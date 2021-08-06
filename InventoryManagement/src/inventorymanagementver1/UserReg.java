/*
 *  PRG2201 Object-Oriented Programming JAN 2021
 *  Project - Inventory Management System
 *  Name: Kathryn Lim i21020061 INTI International University Nilai
 *       
 * 
 *  Handles registration and login forms. Creates an array of 20 admins and 50 sales objects.
 *  This also restricts total admin users to 20 and sales type users to 50.
 */
package inventorymanagementver1;

public class UserReg{
    
    static Admin adminList[] = new Admin[20];  //declares array of 20 admin objects (or admin users)
    static Sales salesList[] = new Sales [50];  //declares array of 50 sales objects (or sale users)
    static Product products[] = new Product [300];
    
  
    
 
    static int adminCount  = 0; //initializes admin Count to 0 at the start of the program
    static int salesCount = 0;  //initializes sales Count to 0 at the start of the program
    static int productCount = 0;
    static int selectedID = 0;     
   
    
    static SignupPage signupPage = new SignupPage();        //new signupPage form object
    static LoginPage loginPage = new LoginPage();           //new login page form object
    static adminHomepage adminHp = new adminHomepage();     //admin homepage
    static salesHomepage salesHp = new salesHomepage();     //sales homepage
    static RegisterStocks regStock = new RegisterStocks();  //register stocks page
    static UpdateStock updStock = new UpdateStock();        //update stocks page
    static CategoryForm categoryForm = new CategoryForm();  //new category page
    static RegisterSale registerSale = new RegisterSale();  //ales registry page
     
    
}
