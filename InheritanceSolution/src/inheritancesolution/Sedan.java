
package inheritancesolution;

public class Sedan extends Car
{
    //Fields
    private int length;
    
    //Constructor >> initilization
    public Sedan(int speed, double regularPrice, String color, int length)
    {
         super(speed,regularPrice, color);
         setLength(length);
    }
    private void setLength(int length)
    {
        this.length=length;
    }
    public double getSalePrice()
    {
        if(length>20)
        {
           return super.getSalePrice()-(0.05*super.getSalePrice()); //access parent class method with super.
        }
        else
        {
            return super.getSalePrice()-(0.1*super.getSalePrice());
        }
    }   
    
}

