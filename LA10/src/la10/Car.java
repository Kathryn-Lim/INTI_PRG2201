/**
 * LA10 Kathryn Lim
 */
package la10;

//super class Car
public class Car {
   protected int speed;
   protected double regularPrice;
   protected String color;
   
   
//   public Car(int s, double p, String c){
//       setSpeed(s);
//       setRegularPrice(p);
//       setColor(c);
//   }
   
   public void setSpeed(int s){
       speed = s;
   }
   
   public void setRegularPrice(double price){
       regularPrice = price;
   }
   
   public void setColor(String c){
       color = c;
   }
    
    public double getSalePrice(){
        return regularPrice;
    }
}
