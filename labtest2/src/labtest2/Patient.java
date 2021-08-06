/**
 * Name: Kathryn Lim
 * Lab Test 2
 * PRG2201 JAN2021 INTI International University
 */

package labtest2;

public abstract class Patient 
{
    private String name;
    private int age;
    private String address;
    private char illness;
    private String illType;
    
    //parameterized constructor
    public Patient(String n, int age, String addr, String ill){
        setName(n);
        setAge(age);
        setAddress(addr);
        setIllness(ill);
    }
    
    //mutators
    private void setName(String n){
        name = n;
    }
    private void setAge(int a){
        age = a;
    }
    private void setAddress(String addr){
        address = addr;
    }
    
    private void setIllness(String ill){
        illType = ill;
        
        if(illType.equals("Critical Illness"))
             illness = 'C';
            else
                illness = 'N';
    }
    
    //accessors
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddr(){
        return address;
    }
    public char getIlltype(){
        return illness;
    }
    
    public String getIllness(){
        return illType;
    }
    
    public String toString(){
         return "\nName: " + getName() + "\tAge: " + getAge() + " \tAddress: " +getAddr();
    }
    
    public abstract void setInsurance_Coverage();
    public abstract double getTotalCost();
    
}// abstract class Patient
