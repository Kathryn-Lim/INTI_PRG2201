
package rectangleclass;

/**
 *
 * @author Kathryn
 */
public class ClientRectangle{
    public static void main(String args[])
    {
        Rectangle rectangle = new Rectangle();
        
        rectangle.setLength(28);
        rectangle.setWidth(10);
        
        System.out.println("The area is " + rectangle.getArea());
    }
}