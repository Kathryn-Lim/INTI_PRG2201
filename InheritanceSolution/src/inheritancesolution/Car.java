
package inheritancesolution;

//Superclass
public class Car 
{
    //Fields
    private int speed;
    private double regularPrice;
    private String color;
    
    //Constructor >> initialization
    public Car(int speed, double regularPrice, String color)
    {
        setSpeed(speed);
        setRegularPrice(regularPrice);
        setColor(color);
    }
    private void setSpeed(int speed)
    {
        this.speed=speed;
    }
    private void setRegularPrice(double regularPrice)
    {
        this.regularPrice=regularPrice;
    }
    private void setColor(String color)
    {
        this.color=color;
    }    
    public double getSalePrice()
    {
        return regularPrice;
    }
    
    
}

