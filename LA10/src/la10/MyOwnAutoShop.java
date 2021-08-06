/**
 * LA10 Kathryn Lim
 */
package la10;

public class MyOwnAutoShop {
    public static void main(String[] args)
   {
       Sedan sedan = new Sedan(30); //creates new Sedan object with length 30 feet, regular price 50,000
       
       Ford mustang = new Ford(2017, 3000); //creates mustang object model year 2017 and discount of 3000, regular Price 100,000
       Ford focus = new Ford(2015, 5000);   //creates a focus object model year 2015 and discount of 5000 regular Price 100,000
       
       Car car = new Car();
        car.setRegularPrice(30000);
        car.setColor("Black");
        car.setSpeed(400);
        
        System.out.println("Price of sedan: " + sedan.getSalePrice());
        System.out.println("Price of Mustang: " + mustang.getSalePrice());
        System.out.println("Price of Focus: " + focus.getSalePrice());
        System.out.println("Price of Car: " + car.getSalePrice());
       
   }
}
