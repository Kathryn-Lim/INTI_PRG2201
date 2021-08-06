/**
 * Name: Kathryn Lim
 * Lab Test 2
 * PRG2201 JAN2021 INTI International University
 */

package labtest2;

import java.util.Scanner;

public class ClientAdmission {
    public static void main (String args[])
    {
        String name, address, illness;
        double cost;
        int age;
        
        Scanner input = new Scanner(System.in);
        int index;
        
       Admission patients[] = new Admission[3];
        
        for(index = 0; index < patients.length; ++index) {        
        System.out.print("\nEnter Name : ");
        name = input.nextLine();
        System.out.print("\nEnter Age : ");
        age = input.nextInt();
        input.nextLine();
        System.out.print("\nEnter Address : ");
        address = input.nextLine();
        System.out.print("\nEnter Illness Type as <Critical Illness> or <Non-Critical illness> : ");
        illness = input.nextLine();
        System.out.print("\nEnter  Cost : ");
        cost = input.nextDouble();
        input.nextLine();
        
        patients[index] = new Admission(name, age, address, illness, cost);
        }
        
        for(int i = 0; i < patients.length; i++) { 
            patients[i].setInsurance_Coverage();
            System.out.println(patients[i].toString());
        }
    }
    
}
