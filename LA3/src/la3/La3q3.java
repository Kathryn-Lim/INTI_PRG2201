/*
Lab Activity 3 - Q3: Microwave Oven
 */
package la3;

import java.util.Scanner;

public class La3q3 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int items;
        float time;
        float heatingTime = 0;
        
        System.out.print("How many items are you heating?: ");
        items = s.nextInt();
        System.out.print("Heating time?: ");
        time = s.nextFloat();
        
        switch(items){
            case 1: heatingTime = time;
                    break;
            
            case 2: heatingTime = time + (time/2); 
                    break;
            
            case 3: heatingTime = time*2;
                    break;
            
            default: break;
        }
        
        if(items <=3)
         System.out.println("Recommended heating time: "+heatingTime);
        else
            System.out.println("Not recommended to heat more than 3 items.");
        
    }
}
