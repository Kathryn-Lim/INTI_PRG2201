import java.util.Scanner;

public class LA1 
{
    public static void main( String args[])
    {
       // int num0, num1, num2, num3, num4;   //declare 5 integer variables
        int num0, num1, num2, num3;   //declare 5 integer variables
        //double num5;    //declare 1 double variables

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 4 integer values: ");
        num0 = scan.nextInt();
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
       
     
        double sum = num0 + num1 + num2 + num3;   //calculates the numbers
        double avg = sum/4; //calculates average of the 4 numbers

        System.out.println("The sum of the numbers is: " +sum);
        System.out.println("The average of the numbers is: " +avg);
    }
}
