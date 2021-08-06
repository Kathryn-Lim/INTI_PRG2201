
package inheritancesolution;

public class Ford extends Car
{
    //Fields
    private int year;
    private int manufacturerDiscount;
    
    //Constructor>>initilization
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount)
    {
        super(speed,regularPrice, color);
        setYear(year);
        setManufacturerDiscount(manufacturerDiscount);
    }
    private void setYear(int year)
    {
        this.year=year;
    }
    private void setManufacturerDiscount(int manufacturerDiscount)
    {
        this.manufacturerDiscount=manufacturerDiscount;
    }    
    public double getSalePrice()
    {
        return super.getSalePrice()-manufacturerDiscount;
    }
    }
        


