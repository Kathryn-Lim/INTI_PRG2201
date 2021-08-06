//Lab Activity week 2 - Q1 Triangle Calculator


package la2;

import java.util.Scanner;

public class LA2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Triangle Area Calculator\n");
        System.out.print("Enter Height of Triangle: ");
        double height = in.nextDouble();
        
        System.out.print("Enter Base of Triangle: ");
        double base = in.nextDouble();
        
        double area = (0.5) * height * base; //formula for area of triangle
        
        System.out.println("Area of Triange is: "+area);
        
    }
    
}
