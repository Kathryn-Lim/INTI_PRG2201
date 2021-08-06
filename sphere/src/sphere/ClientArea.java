
package sphere;

import java.util.Scanner;


public class ClientArea {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        int r = input.nextInt();
        
        Circle area = new Sphere(r);
        System.out.println(area);
    }
}
