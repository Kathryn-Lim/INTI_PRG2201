package labtest1;

import java.util.Scanner;  // Needed for the Scanner class
/**
 *This class demonstrates the Employee class
 */

public class ClientEmployee 
{
    public static void main(String[] args) 
    {
      //Scanner object to read user input  
      Scanner keyboard =  new Scanner(System.in);  
      
      String name;
      double salary;
      int ID;
      int hours;
      
 //*****Creating first employee's profile************
      //Prompts user for input and stores into name
      System.out.print("Enter Employee's Name: ");
      name = keyboard.nextLine();
      
      //Prompts user for input and stores into ID
      System.out.print("Enter Employee's ID number: ");
      ID = keyboard.nextInt();
      
      //Prompts user for input and stores into salary
      System.out.print("Enter Employee's salary: ");
      salary = keyboard.nextDouble();
        
      //Declares and instantiates and Employee object
      Employee employee0 = new Employee(name,ID,salary);
      
      //Prompts user for input and stores into salary
      System.out.print("Enter Employee's hours worked: ");
      hours = keyboard.nextInt();
      
      employee0.calSal(salary,hours);    //calculates employee's net salary
      
      System.out.println(""); //prints next line
      System.out.println("Information");
      System.out.println("***********");
      
      employee0.displayInfo();           //displays employee's name, id, and daily net salary
      System.out.println("\n\n"); //prints next line
      
      
 //*****Creating second employee's profile************  
        
      keyboard.nextLine();      //dummy character
        
      //Prompts user for input and stores into name
      System.out.print("Enter Employee's Name: ");
      name = keyboard.nextLine();
      
      //Prompts user for input and stores into ID
      System.out.print("Enter Employee's ID number: ");
      ID = keyboard.nextInt();
      
      //Prompts user for input and stores into salary
      System.out.print("Enter Employee's salary: ");
      salary = keyboard.nextDouble();
        
      //Declares and instantiates and Employee object
      Employee employee1 = new Employee(name,ID,salary);
      
      //Prompts user for input and stores into salary
      System.out.print("Enter Employee's hours worked: ");
      hours = keyboard.nextInt();
      
      employee1.calSal(salary,hours);    //calculates employee's net salary
      
      System.out.println(""); //prints next line
      System.out.println("Information");
      System.out.println("***********");
      
      employee1.displayInfo();           //displays employee's name, id, and daily net salary
    }
}
