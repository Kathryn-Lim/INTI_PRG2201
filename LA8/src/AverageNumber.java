/**
 * LA8 - Display Sum and average of 2 numbers with dialog boxes
 */

import javax.swing.JOptionPane;

public class AverageNumber {
    
    public static void main(String[] args){
        
        String num1;
        num1 = JOptionPane.showInputDialog("Enter a Number");
        
        String num2;
        num2 = JOptionPane.showInputDialog("Enter a Number");

        int sum;
        sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        
        double avg;
        avg = sum/2;
        
        String evenOdd;
        
        if(avg%2 == 0)
            evenOdd = "even";
            else
                evenOdd = "odd";
        
                
        String msg;
        msg = "Values entered: " + num1 + " " + num2 + "\nSum: " +sum 
                +"\nAverage: " +avg + "\nAverage is an " + evenOdd + " number";
          
        JOptionPane.showMessageDialog(null, msg);
        
        System.exit(0);
    }
    
}
