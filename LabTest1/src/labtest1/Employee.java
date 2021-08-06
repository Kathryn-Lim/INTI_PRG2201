package labtest1;

/*
 * The purpose of this class is to store an employee's information and calculate
 * their salary based on their hours worked
 */

public class Employee
{
    private String emp_Name;    //employee emp_Name
    private int emp_ID;     //employee ID number
    private double salary;     //employee salary
    
    /**
     * The constructor creates an employee profile with the
        given name, ID, and daily salary
     * @param Name  The Employee's name
     * @param id    The employee's ID
     * @param Salary    The employee's salary
     */
    public Employee(String Name, int id, double Salary)
    {
        emp_Name = Name;
        emp_ID = id;
        salary = Salary;
    }
    
    /**
     * Accessor method returns employee name
     * @return employee name
     */
    
    public String getName()
    {
        return emp_Name;
    }
    
    /**
     * Accessor method returns employee ID
     * @return employeeID
     */
    
    public int getID()
    {
        return emp_ID;
    }
    
    /**
     * Accessor method returns employee total salary
     * @return employee's calculated total salary for the day
     */
    
    public double getSalary()
    {
        return salary;
    }
    
    /**
     * Mutator method stores the employees's emp_Name in the
       name field
     * @param N 
     */
    
    private void setName(String N)
    {
        this.emp_Name = N;
    }
    
    /**
     * Mutator method stores ID in the emp_ID field
     * @param id 
     */
    
    private void setID(int id)
    {
        this.emp_ID = id;
    }
    
    /**
     * Mutator method stores salary in salary field
     * @param sal 
     */
    
    private void setSal(double sal)
    {
        this.salary = sal;
    }
 
    
    /**
     * This method calculates employee salary based on hours
     * @param sal
     * @param hrs 
     */
    
    public void calSal(double sal, int hrs)
    {
        this.salary = sal;
        this.AddSal();
        this.AddWork(hrs);
    }
    
    /**
     * Method that adds $10 to employee's salary if it is less than $50
     */
    
    public void AddSal()
    {
        if(this.salary < 50)
            this.salary+=10.0;
    }
    
    /**
     * this method adds $5 to the employee's salary
     * if their work hours is more than 6
     * @param hrs
     */
    
    public void AddWork(int hrs)
    { 
        if(hrs > 6)
            this.salary += 5.0;   //adds $5 to the salary of the employee if number of hours worked >6
    }
    
    /**
     * this method displays employee information
     */
    
    public void displayInfo()
    {
     System.out.println("Name " +
                 this.emp_Name +
                 "\tEmployee's Id " +
                 this.emp_ID +
                 " \tNet Salary per Day: " +
                    this.salary);
    }

}
