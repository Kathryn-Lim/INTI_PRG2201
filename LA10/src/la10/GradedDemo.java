/**
 * LA10 Kathryn Lim
 */
package la10;

import javax.swing.JOptionPane;

public class GradedDemo {
    public static void main(String[] args)
    {
        String input; //to hold input
        double testScore;
        
        GradedActivity grade = new GradedActivity();
        
        input = JOptionPane.showInputDialog("Enter" + " a numeric test score.");
        testScore = Double.parseDouble(input);
        
        //Store the score in the grade object
        grade.setScore(testScore);
        
        //Display the letter grade for the score/
        JOptionPane.showMessageDialog(null, "The grade for that test is " + grade.getGrade());
        
        System.exit(0);
    }
}
