
package inheritancesolution;

public class Truck extends Car
{
    //Fields
    private int weight;
    
    //Constructor >> initilization
    public Truck(int speed, double regularPrice, String color, int weight)
    {
        super(speed,regularPrice,color);
        setWeight(weight);
    }
    private void setWeight(int weight)
    {
        this.weight=weight;
    }    
    public double getSalePrice()
    {
        if(weight>2000)
        {
            return super.getSalePrice()-(0.1*super.getSalePrice());
        }
        else
        {
            return super.getSalePrice()-(0.2*super.getSalePrice());
        }
    }
    
}

